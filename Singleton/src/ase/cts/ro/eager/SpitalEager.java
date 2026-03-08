package ase.cts.ro.eager;

public class SpitalEager {
    private String numeSpital;
    private String adresaSpital;
    private int nrMaxPacienti;
    private int nrCamere;

    private static final SpitalEager instanta = new SpitalEager();

    private SpitalEager() {
        this.numeSpital = "ABC";
        this.adresaSpital = "Str. Principala Nr.19";
        this.nrMaxPacienti = 10;
        this.nrCamere = 20;
    }

    public static SpitalEager getInstanta() {
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
        final StringBuilder sb = new StringBuilder("SpitalEager{");
        sb.append("numeSpital='").append(numeSpital).append('\'');
        sb.append(", adresaSpital='").append(adresaSpital).append('\'');
        sb.append(", nrMaxPacienti=").append(nrMaxPacienti);
        sb.append(", nrCamere=").append(nrCamere);
        sb.append('}');
        return sb.toString();
    }
}