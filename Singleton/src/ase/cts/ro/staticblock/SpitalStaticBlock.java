package ase.cts.ro.staticblock;

public class SpitalStaticBlock {
    private String numeSpital;
    private String adresaSpital;
    private int nrMaxPacienti;
    private int nrCamere;

    private static SpitalStaticBlock instanta;

    static {
        try {
            instanta = new SpitalStaticBlock();
        } catch (Exception e) {
            System.out.println("Spitalul nu poate fi creat.");
        }
    }

    private SpitalStaticBlock() {
        this.numeSpital = "ABC";
        this.adresaSpital = "Str. Principala Nr.19";
        this.nrMaxPacienti = 10;
        this.nrCamere = 20;
    }

    public static SpitalStaticBlock getInstanta() {
        return instanta;
    }

    public String getNumeSpital() {
        return numeSpital;
    }

    public void setNumeSpital(String numeSpital) {
        this.numeSpital = numeSpital;
    }

    public String getAdresaSpital() {
        return adresaSpital;
    }

    public void setAdresaSpital(String adresaSpital) {
        this.adresaSpital = adresaSpital;
    }

    public int getNrMaxPacienti() {
        return nrMaxPacienti;
    }

    public void setNrMaxPacienti(int nrMaxPacienti) {
        this.nrMaxPacienti = nrMaxPacienti;
    }

    public int getNrCamere() {
        return nrCamere;
    }

    public void setNrCamere(int nrCamere) {
        this.nrCamere = nrCamere;
    }

    @Override
    public String toString() {
        return "SpitalStaticBlock{" +
                "numeSpital='" + numeSpital + '\'' +
                ", adresaSpital='" + adresaSpital + '\'' +
                ", nrMaxPacienti=" + nrMaxPacienti +
                ", nrCamere=" + nrCamere +
                '}';
    }
}