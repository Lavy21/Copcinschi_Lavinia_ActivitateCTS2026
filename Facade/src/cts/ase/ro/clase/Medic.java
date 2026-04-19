package cts.ase.ro.clase;

public class Medic {
    private String nume;
    private boolean esteOcupat;

    public Medic(String nume, boolean esteOcupat) {
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