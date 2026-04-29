package cts.ase.ro.clase;

public class Consultatie implements ServiciuMedical {

    @Override
    public void descriere() {
        System.out.println("Acest serviciu include o consultatie medicala");
    }

    @Override
    public void programeazaServiciu() {
        System.out.println("A fost realizata o programare pentru consultatie");
    }
}