package cts.ase.ro.clase;

public class Pacient {
    private String nume;
    private int varsta;
    private int nrPat;

    public Pacient(String nume, int varsta, int nrPat) {
        super();
        this.nume = nume;
        this.varsta = varsta;
        this.nrPat = nrPat;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public int getNrPat() {
        return nrPat;
    }
}