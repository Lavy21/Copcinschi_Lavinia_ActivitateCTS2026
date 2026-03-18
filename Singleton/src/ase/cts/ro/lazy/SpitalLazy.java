package ase.cts.ro.lazy;

public class SpitalLazy {
    private String numeSpital;
    private String adresaSpital;
    private int nrMaxPacienti;
    private int nrCamere;

    private static SpitalLazy instanta = null;

    public SpitalLazy(String numeSpital, String adresaSpital, int nrMaxPacienti, int nrCamere) {
        this.numeSpital = numeSpital;
        this.adresaSpital = adresaSpital;
        this.nrMaxPacienti = nrMaxPacienti;
        this.nrCamere = nrCamere;
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

    public static SpitalLazy getInstanta(String numeSpital, String adresaSpital, int nrMaxPacienti, int nrCamere) {
        if (instanta == null) {
            instanta = new SpitalLazy(numeSpital, adresaSpital, nrMaxPacienti, nrCamere);
        }
        return instanta;
    }

    public static void setInstanta(SpitalLazy instanta) {
        SpitalLazy.instanta = instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SpitalLazy{");
        sb.append("numeSpital='").append(numeSpital).append('\'');
        sb.append(", adresaSpital='").append(adresaSpital).append('\'');
        sb.append(", nrMaxPacienti=").append(nrMaxPacienti);
        sb.append(", nrCamere=").append(nrCamere);
        sb.append('}');
        return sb.toString();
    }
}