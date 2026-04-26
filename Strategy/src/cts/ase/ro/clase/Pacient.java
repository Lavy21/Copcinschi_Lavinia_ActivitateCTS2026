package cts.ase.ro.clase;

public class Pacient {
    private String nume;
    private int varsta;
    private int gradUrgenta;
    public Pacient(String nume, int varsta, int gradUrgenta) {
        this.nume = nume;
        this.varsta = varsta;
        this.gradUrgenta = gradUrgenta;
    }
    public String getNume() {
        return nume;
    }
    public int getVarsta() {
        return varsta;
    }
    public int getGradUrgenta() {
        return gradUrgenta;
    }

    @Override
    public String toString() {
        return nume + ", varsta=" + varsta +
                ", gradUrgenta=" + gradUrgenta ;
    }
}