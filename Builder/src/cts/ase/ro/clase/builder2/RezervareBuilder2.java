package cts.ase.ro.clase.builder2;

import cts.ase.ro.clase.builder.BuilderAbstract;
import cts.ase.ro.clase.builder.Rezervare;
//varianta2

public class RezervareBuilder2 implements BuilderAbstract {
    private boolean laUsa;
    private boolean comandaElectronicaPat;
    private String culoareAsternut;
    private String genProgrameTV;
    private int nrPacienti;

    @Override
    public Rezervare build() {
        return new Rezervare(laUsa,comandaElectronicaPat,culoareAsternut,genProgrameTV,nrPacienti);
    }
public RezervareBuilder2() {
    this.laUsa = true;
    this.comandaElectronicaPat = true;
    this.culoareAsternut = "Albastru";
    this.genProgrameTV = "Comedie";
    this.nrPacienti = 1;
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
