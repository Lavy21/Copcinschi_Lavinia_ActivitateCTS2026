package cts.ase.ro.proxy;

public class Spital implements ISpital {

    @Override
    public void permiteAccesSalon(Vizitator vizitator) {
        System.out.println("Vizitatorul " + vizitator.getNume() +
                " a primit acces in salon.");
    }
}