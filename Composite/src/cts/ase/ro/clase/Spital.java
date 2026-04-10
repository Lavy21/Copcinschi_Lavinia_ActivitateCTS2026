package cts.ase.ro.clase;

public class Spital {

    private Sectie structura; //nodul radacina
    private String numeSpital;
    public Spital(Sectie structura, String numeSpital) {
        this.structura = structura;
        this.numeSpital = numeSpital;
    }

    public Sectie getStructura() {
        return structura;
    }

    public void setStructura(Sectie structura) {
        this.structura = structura;
    }

    public String getNumeSpital() {
        return numeSpital;
    }

    public void setNumeSpital(String numeSpital) {
        this.numeSpital = numeSpital;
    }
}