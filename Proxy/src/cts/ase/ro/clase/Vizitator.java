package cts.ase.ro.clase;

public class Vizitator {
    private String nume;
    private int varsta;
    public Vizitator(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
    public String getNume() {
        return nume;
    }
    public int getVarsta() {
        return varsta;
    }

    @Override
    public String toString() {
        return nume + ", in varsta de " + varsta + " ani";
    }
}