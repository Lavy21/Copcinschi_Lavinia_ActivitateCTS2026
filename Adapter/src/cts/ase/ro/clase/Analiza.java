package cts.ase.ro.clase;

public class Analiza {

    private String tipAnaliza;
    private float pret;
    public Analiza(String tipAnaliza, float pret) {
        super();
        this.tipAnaliza = tipAnaliza;
        this.pret = pret;
    }
    public String getTipAnaliza() {
        return tipAnaliza;
    }
    public float getPret() {
        return pret;
    }
}