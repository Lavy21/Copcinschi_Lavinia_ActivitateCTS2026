package cts.ase.ro.clase;

public class Asistent {
    private String nume;
    private boolean esteOcupat;

    public Asistent(String nume, boolean esteOcupat) {
        this.nume = nume;
        this.esteOcupat = esteOcupat;
    }
    public String getNume() {
        return nume;
    }
    public boolean isEsteOcupat() {
        return esteOcupat;
    }
}