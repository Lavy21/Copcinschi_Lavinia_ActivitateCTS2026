package cts.ase.ro.program;

import cts.ase.ro.clase.IVizitare;
import cts.ase.ro.clase.Vizita;
import cts.ase.ro.clase.VizitaProxy;
import cts.ase.ro.clase.Vizitator;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<String> listaOreVizita = new ArrayList<>();
        listaOreVizita.add("18:00-18:30");
        listaOreVizita.add("18:30-19:00");
        listaOreVizita.add("19:00-19:30");
        listaOreVizita.add("19:30-20:00");
        Vizitator v1 = new Vizitator("Pandele Cristina", 45);
        Vizitator v2 = new Vizitator("Negroiu Dan", 38);
        Vizitator v3 = new Vizitator("Nastase Dorina", 51);
        IVizitare vizita = new Vizita("Manea Gelu", "20.04.2026", listaOreVizita);
        vizita.afisareProgramVizita();
        vizita.adaugaVizitator(v1);
        IVizitare vizitaProxy = new VizitaProxy(vizita);
        vizitaProxy.adaugaVizitator(v2);
        vizitaProxy.adaugaVizitator(v3);
    }
}