package cts.ase.ro.clase;

public class FiltrareCuloareObservatie extends AHandler {

    @Override
    public void filtrare(DosarPacient dosar) {
        System.out.println("S-a filtrat de culoare observatie");
        super.filtrare(dosar);
    }
}