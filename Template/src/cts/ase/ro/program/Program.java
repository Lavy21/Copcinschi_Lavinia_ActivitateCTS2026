package cts.ase.ro.program;
import cts.ase.ro.clase.AInternarePacient;
import cts.ase.ro.clase.InternareProgramare;
import cts.ase.ro.clase.InternareUrgenta;

public class Program {
    public static void main(String[] args) {
        AInternarePacient internareUrgenta = new InternareUrgenta();
        System.out.println("Procedura internare pacient");
        internareUrgenta.proceduraInternarePacient();
        AInternarePacient internareProgramare = new InternareProgramare();
        System.out.println("Procedura internare pacient");
        internareProgramare.proceduraInternarePacient();
    }
}