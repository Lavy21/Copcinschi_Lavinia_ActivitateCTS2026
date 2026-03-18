package cts.ase.ro.program;

import cts.ase.ro.clase.Pacient;
import cts.ase.ro.clase.PacientFactory;
import cts.ase.ro.clase.TipPacient;

public class ProgramSF {
    public static void main(String[] args) {
        PacientFactory fabrica = new PacientFactory();
        Pacient pacient;

        pacient= fabrica.createInstance(TipPacient.Copil);
        pacient.descriere();
        pacient= fabrica.createInstance(TipPacient.Adult);
        pacient.descriere();
        pacient= fabrica.createInstance(TipPacient.Pensionar);
        pacient.descriere();
    }
}
