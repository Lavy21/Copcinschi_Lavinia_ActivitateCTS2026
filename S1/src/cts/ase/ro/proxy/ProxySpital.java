package cts.ase.ro.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxySpital implements ISpital {

    private ISpital spital;
    private List<Vizitator> listaVizitatori;

    public ProxySpital(ISpital spital) {
        this.spital = spital;
        this.listaVizitatori = new ArrayList<Vizitator>();
    }

    @Override
    public void permiteAccesSalon(Vizitator vizitator) {

        if (!vizitator.isAreScrisoareAcceptare()) {
            System.out.println("Vizitatorul " + vizitator.getNume() +
                    " nu are scrisoare de acceptare.");
        } else {
            listaVizitatori.add(vizitator);
            System.out.println("Vizitatorul " + vizitator.getNume() +
                    " asteapta in sala de asteptare.");

            if (listaVizitatori.size() >= 3) {
                System.out.println("Personalul medical echipeaza vizitatorii.");

                for (Vizitator v : listaVizitatori) {
                    v.setEsteEchipat(true);
                    spital.permiteAccesSalon(v);
                }

                listaVizitatori.clear();
            }
        }
    }
}