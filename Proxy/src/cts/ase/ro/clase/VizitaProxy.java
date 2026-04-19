package cts.ase.ro.clase;

public class VizitaProxy implements IVizitare {
    private IVizitare vizita;
    public VizitaProxy(IVizitare vizita) {
        super();
        this.vizita = vizita;
    }

    @Override
    public void adaugaVizitator(Vizitator vizitator) {
        if (((Vizita) vizita).getNrVizitatori() < 1) {
            vizita.adaugaVizitator(vizitator);
        } else {
            System.out.println("Vizitatorul " + vizitator.getNume() +
                    " nu poate intra. Este permis un singur vizitator pe pacient pe zi.");
        }
    }

    @Override
    public void afisareProgramVizita() {
        this.vizita.afisareProgramVizita();
    }
}