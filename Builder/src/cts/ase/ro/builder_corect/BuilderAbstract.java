package cts.ase.ro.builder_corect;

public interface BuilderAbstract {
    RezervareFinala build();
    BuilderAbstract setLaUsa(boolean laUsa);
    BuilderAbstract setComandaElectronicaPat(boolean comandaElectronicaPat);
    BuilderAbstract setCuloareAsternut(String culoareAsternut);
    BuilderAbstract setGenProgrameTV(String genProgrameTV);
    BuilderAbstract setNrPacienti(int nrPacienti);
}
