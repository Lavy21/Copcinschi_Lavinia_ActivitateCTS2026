package cts.ase.ro.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISubiect {
    private String numeSpital;
    private List<IObserver> listaObservatori;
    public Spital(String numeSpital) {
        super();
        this.numeSpital = numeSpital;
        this.listaObservatori = new ArrayList<>();
    }

    @Override
    public void addObserver(IObserver observer) {
        this.listaObservatori.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.listaObservatori.remove(observer);
    }

    @Override
    public void notifyAll(String mesaj) {
        for (IObserver observer : listaObservatori)
            observer.getMesaj(mesaj);
    }

    public void addServiciuMedical(String serviciu) {
        this.notifyAll("A fost adaugat un nou serviciu medical");
    }

    public void modificareProgramVizita(String program) {
        this.notifyAll("Programul de vizita a fost modificat");
    }
}