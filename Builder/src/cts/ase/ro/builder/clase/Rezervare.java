package cts.ase.ro.builder.clase;

public class Rezervare {
    private boolean laUsa;
    private boolean comandaElectronicaPat;
    private String culoareAsternut;
    private String genProgrameTV;
    private int nrPacienti;

    public Rezervare(boolean laUsa, boolean comandaElectronicaPat, String culoareAsternut, String genProgrameTV, int nrPacienti) {
        this.laUsa = laUsa;
        this.comandaElectronicaPat = comandaElectronicaPat;
        this.culoareAsternut = culoareAsternut;
        this.genProgrameTV = genProgrameTV;
        this.nrPacienti = nrPacienti;
    }
    public Rezervare() {
        this.laUsa = true;
        this.comandaElectronicaPat = true;
        this.culoareAsternut = "Albastru";
        this.genProgrameTV = "Comedie";
        this.nrPacienti = 1;
    }

    public void setLaUsa(boolean laUsa) {
        this.laUsa = laUsa;
    }

    public void setComandaElectronicaPat(boolean comandaElectronicaPat) {
        this.comandaElectronicaPat = comandaElectronicaPat;
    }

    public void setCuloareAsternut(String culoareAsternut) {
        this.culoareAsternut = culoareAsternut;
    }

    public void setGenProgrameTV(String genProgrameTV) {
        this.genProgrameTV = genProgrameTV;
    }

    public void setNrPacienti(int nrPacienti) {
        this.nrPacienti = nrPacienti;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("laUsa=").append(laUsa);
        sb.append(", comandaElectronicaPat=").append(comandaElectronicaPat);
        sb.append(", culoareAsternut='").append(culoareAsternut).append('\'');
        sb.append(", genProgrameTV='").append(genProgrameTV).append('\'');
        sb.append(", nrPacienti=").append(nrPacienti);
        sb.append('}');
        return sb.toString();
    }
}
