package cts.ase.ro.clase;

public class InternareProgramare extends AInternarePacient {

    @Override
    void evaluareInitialaPacient() {
        System.out.println("Evaluare initiala pacient pe baza programarii");
    }

    @Override
    void repartizarePacientSalon() {
        System.out.println("Repartizare pacient programat in salonul alocat");
    }
}