package cts.ase.ro.builder.clase.builder;

import cts.ase.ro.builder.clase.Rezervare;

public interface BuilderAbstract {
    Rezervare build();
    BuilderAbstract setLaUsa(boolean laUsa);
    BuilderAbstract setComandaElectronicaPat(boolean comandaElectronicaPat);
    BuilderAbstract setCuloareAsternut(String culoareAsternut);
    BuilderAbstract setGenProgrameTV(String genProgrameTV);
    BuilderAbstract setNrPacienti(int nrPacienti);
}
