package cts.ase.ro.builder.clase.builder;

import cts.ase.ro.builder.clase.Rezervare;

public class RezervareBuilder implements BuilderAbstract {
//varianta 1
private Rezervare rezervare=null;
public RezervareBuilder(){
    rezervare=new Rezervare();
}
public BuilderAbstract setLaUsa(boolean laUsa){
        rezervare.setLaUsa(laUsa);
        return this;
}
public BuilderAbstract setComandaElectronicaPat(boolean comandaElectronicaPat){
        rezervare.setComandaElectronicaPat(comandaElectronicaPat);
        return this;
}
public BuilderAbstract setCuloareAsternut(String culoareAsternut){
        rezervare.setCuloareAsternut(culoareAsternut);
        return this;
}
public BuilderAbstract setGenProgrameTV(String genProgrameTV){
    rezervare.setGenProgrameTV(genProgrameTV);
    return this;
}
public BuilderAbstract setNrPacienti(int nrPacienti){
    rezervare.setNrPacienti(nrPacienti);
    return this;
}
    @Override
    public Rezervare build() {
        return rezervare;
    }
}
