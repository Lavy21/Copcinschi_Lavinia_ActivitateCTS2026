package cts.ase.ro.clase;

public class FiltrareSetariObservatie extends AHandler {

    @Override
    public void filtrare(DosarPacient dosar) {
        System.out.println("S-a filtrat de setari observatie");
        super.filtrare(dosar);
    }
}