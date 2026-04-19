package cts.ase.ro.clase;

import java.util.ArrayList;
import java.util.List;

public class Vizita implements IVizitare {

    private String numePacient;
    private String data;
    private List<String> listaOreVizita;
    private List<Vizitator> listaVizitatori;

    public Vizita(String numePacient, String data, List<String> listaOreVizita) {
        super();
        this.numePacient = numePacient;
        this.data = data;
        this.listaOreVizita = listaOreVizita;
        this.listaVizitatori = new ArrayList<>();
    }

    @Override
    public void adaugaVizitator(Vizitator vizitator) {
        this.listaVizitatori.add(vizitator);
        System.out.println("Vizitatorul " + vizitator + " a fost adaugat pentru pacientul " + this.numePacient);
    }

    @Override
    public void afisareProgramVizita() {
        System.out.println("Program vizita pentru pacientul " + this.numePacient + " in data de " + this.data);
        for (String ora : listaOreVizita) {
            System.out.println(ora);
        }
    }

    public int getNrVizitatori() {
        return this.listaVizitatori.size();
    }
}