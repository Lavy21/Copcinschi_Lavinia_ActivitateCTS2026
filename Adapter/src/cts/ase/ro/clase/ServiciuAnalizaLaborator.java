package cts.ase.ro.clase;

public class ServiciuAnalizaLaborator implements ServiciuMedical {
    private AnalizaLaborator analizaLaborator;
    public ServiciuAnalizaLaborator(AnalizaLaborator analizaLaborator) {
        super();
        this.analizaLaborator = analizaLaborator;
    }

    @Override
    public void descriere() {
        System.out.println(analizaLaborator.toString());
    }

    @Override
    public void programeazaServiciu() {
        analizaLaborator.programeazaAnaliza();
    }
}