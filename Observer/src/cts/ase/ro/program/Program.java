package cts.ase.ro.program;

import cts.ase.ro.clase.Pacient;
import cts.ase.ro.clase.Spital;

public class Program {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Andrei");
        Pacient pacient2 = new Pacient("Maria");
        Pacient pacient3 = new Pacient("Elena");
        Spital spital = new Spital("Spitalul Universitar");
        spital.addObserver(pacient1);
        spital.addObserver(pacient2);
        spital.addObserver(pacient3);
        System.out.println("Adaugare serviciu medical nou");
        spital.addServiciuMedical("RMN - 250 lei");
        spital.removeObserver(pacient1);
        System.out.println("\nModificare program vizita");
        spital.modificareProgramVizita("Luni-Vineri 16:00-18:00");

    }

}