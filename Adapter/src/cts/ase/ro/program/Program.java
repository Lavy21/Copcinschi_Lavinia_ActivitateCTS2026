package cts.ase.ro.program;

import cts.ase.ro.clase.Analiza;
import cts.ase.ro.clase.AnalizaLaborator;
import cts.ase.ro.clase.Consultatie;
import cts.ase.ro.clase.ServiciuAnalizaLaborator;
import cts.ase.ro.clase.ServiciuMedical;

public class Program {
    private static void printeazaProgramare(ServiciuMedical serviciuMedical) {
        System.out.print("Pentru pacient: ");
        serviciuMedical.descriere();
        System.out.print("Pentru operator: ");
        serviciuMedical.programeazaServiciu();
    }
    public static void main(String[] args) {
        ServiciuMedical consultatie = new Consultatie();
        printeazaProgramare(consultatie);
        System.out.println();
        System.out.println("Vrem sa folosim libraria pentru analize de laborator");
        System.out.println();
        System.out.println("Utilizare in modul clasic:");
        Analiza analiza = new Analiza("Hemoleucograma", 75);
        AnalizaLaborator analizaLaborator = new AnalizaLaborator(analiza);
        System.out.println();
        System.out.println("Nu se foloseste metoda de printare.");
        System.out.print("Pentru pacient: ");
        System.out.println(analizaLaborator.toString());
        System.out.print("Pentru operator: ");
        analizaLaborator.programeazaAnaliza();
        System.out.println();
        System.out.println("Se foloseste adapterul de obiecte");
        Analiza analiza2 = new Analiza("Glicemie", 35);
        AnalizaLaborator analizaLaborator2 = new AnalizaLaborator(analiza2);
        ServiciuMedical serviciuAnalizaLaborator = new ServiciuAnalizaLaborator(analizaLaborator2);
        System.out.println();
        System.out.println("Se foloseste metoda de printare");
        printeazaProgramare(serviciuAnalizaLaborator);
    }
}