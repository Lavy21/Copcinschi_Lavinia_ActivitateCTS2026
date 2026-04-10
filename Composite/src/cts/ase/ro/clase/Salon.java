package cts.ase.ro.clase;

public class Salon extends ANod {

    private String denumire;
    private int nrLocuri;

    public Salon(String denumire, int nrLocuri) {
        this.denumire = denumire;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String getDenumire() {
        return this.denumire;
    }

    @Override
    public int getNrLocuri() {
        return this.nrLocuri;
    }
}