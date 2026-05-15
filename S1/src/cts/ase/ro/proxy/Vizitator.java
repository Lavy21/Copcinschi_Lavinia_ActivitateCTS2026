package cts.ase.ro.proxy;

public class Vizitator {

    private String nume;
    private boolean areScrisoareAcceptare;
    private boolean esteEchipat;

    public Vizitator(String nume, boolean areScrisoareAcceptare) {
        this.nume = nume;
        this.areScrisoareAcceptare = areScrisoareAcceptare;
        this.esteEchipat = false;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreScrisoareAcceptare() {
        return areScrisoareAcceptare;
    }

    public boolean isEsteEchipat() {
        return esteEchipat;
    }

    public void setEsteEchipat(boolean esteEchipat) {
        this.esteEchipat = esteEchipat;
    }

}