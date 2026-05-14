package cts.ase.ro.program;

import cts.ase.ro.clase.*;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<IItem> itemi = new ArrayList<>();
        itemi.add(new Analiza("Hemoglobina", 13.5f));
        itemi.add(new Observatie("Pacient stabil", "verde", true));
        itemi.add(new Analiza("Glicemie", 96));
        itemi.add(new Observatie("Necesita monitorizare", "galben", true));
        DosarPacient dosar = new DosarPacient(itemi, "Popescu Ana");
        System.out.println(dosar);
        IHandler h1 = new FiltrareAnalize();
        IHandler h2 = new FiltrareCuloareObservatie();
        IHandler h3 = new FiltrareSetariObservatie();
        h1.setNextHandler(h2);
        h2.setNextHandler(h3);
        h1.filtrare(dosar);
        System.out.println(dosar);
    }
}