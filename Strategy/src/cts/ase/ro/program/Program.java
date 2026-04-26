package cts.ase.ro.program;
import cts.ase.ro.clase.Pacient;
import cts.ase.ro.clase.SectieSpital;
import cts.ase.ro.clase.StrategieUrgentaMaxima;
import cts.ase.ro.clase.StrategieVarstaMinima;

public class Program {
    public static void main(String[] args) {
        SectieSpital sectieSpital = new SectieSpital();
        Pacient pacient1 = new Pacient("Grigore Dumitru", 67, 2);
        Pacient pacient2 = new Pacient("Costea Cristina", 35, 5);
        Pacient pacient3 = new Pacient("Dina Georgeta", 42, 3);
        Pacient pacient4 = new Pacient("Marin Mihai", 18, 1);
        sectieSpital.addPacient(pacient1);
        sectieSpital.addPacient(pacient2);
        sectieSpital.addPacient(pacient3);
        sectieSpital.addPacient(pacient4);
        sectieSpital.setStrategieAlegere(new StrategieVarstaMinima());
        System.out.println("Pacientul cu varsta minima este " + sectieSpital.alegerePacient());
        sectieSpital.setStrategieAlegere(new StrategieUrgentaMaxima());
        System.out.println("Pacientul cu urgenta maxima este " + sectieSpital.alegerePacient());
    }
}