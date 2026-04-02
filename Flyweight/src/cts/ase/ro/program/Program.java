package cts.ase.ro.program;
import cts.ase.ro.clase.FabricaSaloane;
import cts.ase.ro.clase.Pacient;

public class Program {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Popescu Ana", 25, 1);
        Pacient pacient2 = new Pacient("Ionescu Mihai", 47, 2);
        Pacient pacient3 = new Pacient("Georgescu Elena", 63, 1);
        Pacient pacient4 = new Pacient("Marin Andrei", 31, 3);

        FabricaSaloane.getSalon(101, 3, "Cardiologie").interneazaPacient(pacient1);
        FabricaSaloane.crestereInternari();
        FabricaSaloane.getSalon(101, 3, "Cardiologie").interneazaPacient(pacient2);
        FabricaSaloane.crestereInternari();
        FabricaSaloane.getSalon(102, 2, "Ortopedie").interneazaPacient(pacient3);
        FabricaSaloane.crestereInternari();
        FabricaSaloane.getSalon(101, 3, "Cardiologie").interneazaPacient(pacient4);
        FabricaSaloane.crestereInternari();
        System.out.println(FabricaSaloane.getNrPacientiInternati() + " pacienti internati");
        System.out.println(FabricaSaloane.getNrSaloane() + " saloane create");

    }
}