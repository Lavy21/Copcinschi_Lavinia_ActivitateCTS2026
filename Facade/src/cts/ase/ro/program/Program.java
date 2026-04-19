package cts.ase.ro.program;
import cts.ase.ro.clase.Asistent;
import cts.ase.ro.clase.Facade;
import cts.ase.ro.clase.Medic;

public class Program {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.addMedic(new Medic("Ghinea", false));
        facade.addMedic(new Medic("Baciu", true));
        facade.addMedic(new Medic("Rascu", false));
        facade.addAsistent(new Asistent("Ioana", false));
        facade.addAsistent(new Asistent("Elena", false));
        facade.addAsistent(new Asistent("Andrei", true));
        if (facade.verificaDisponibilitateData("12/05/2026", 4)) {
            System.out.println("Exista personal disponibil pentru internare in data de 12/05/2026");
        } else {
            System.out.println("Nu exista personal disponibil pentru internare in data de 12/05/2026");
        }
        if (facade.verificaDisponibilitateData("13/05/2026", 8)) {
            System.out.println("Exista personal disponibil pentru internare in data de 13/05/2026");
        } else {
            System.out.println("Nu exista personal disponibil pentru internare in data de 13/05/2026");
        }
    }
}