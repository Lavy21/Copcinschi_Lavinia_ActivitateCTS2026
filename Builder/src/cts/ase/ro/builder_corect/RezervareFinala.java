package cts.ase.ro.builder_corect;

public class RezervareFinala {
    private boolean laUsa;
    private boolean comandaElectronicaPat;
    private String culoareAsternut;
    private String genProgrameTV;
    private int nrPacienti;
public static class Builder implements BuilderAbstract{
    private boolean laUsa;
    private boolean comandaElectronicaPat;
    private String culoareAsternut;
    private String genProgrameTV;
    private int nrPacienti;
    @Override
    public RezervareFinala build() {
        return new RezervareFinala(laUsa,comandaElectronicaPat,culoareAsternut,genProgrameTV,nrPacienti);
    }

    @Override
    public BuilderAbstract setLaUsa(boolean laUsa) {
        this.laUsa=laUsa;
        return this;
    }

    @Override
    public BuilderAbstract setComandaElectronicaPat(boolean comandaElectronicaPat) {
        this.comandaElectronicaPat=comandaElectronicaPat;
        return this;
    }

    @Override
    public BuilderAbstract setCuloareAsternut(String culoareAsternut) {
        this.culoareAsternut=culoareAsternut;
        return this;
    }

    @Override
    public BuilderAbstract setGenProgrameTV(String genProgrameTV) {
        this.genProgrameTV=genProgrameTV;
        return this;
    }

    @Override
    public BuilderAbstract setNrPacienti(int nrPacienti) {
        this.nrPacienti=nrPacienti;
        return this;
    }
}
    private RezervareFinala(boolean laUsa, boolean comandaElectronicaPat, String culoareAsternut, String genProgrameTV, int nrPacienti) {
        this.laUsa = laUsa;
        this.comandaElectronicaPat = comandaElectronicaPat;
        this.culoareAsternut = culoareAsternut;
        this.genProgrameTV = genProgrameTV;
        this.nrPacienti = nrPacienti;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RezervareFinala{");
        sb.append("laUsa=").append(laUsa);
        sb.append(", comandaElectronicaPat=").append(comandaElectronicaPat);
        sb.append(", culoareAsternut='").append(culoareAsternut).append('\'');
        sb.append(", genProgrameTV='").append(genProgrameTV).append('\'');
        sb.append(", nrPacienti=").append(nrPacienti);
        sb.append('}');
        return sb.toString();
    }
}
