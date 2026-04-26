package cts.ase.ro.clase;

public class InternareUrgenta extends AInternarePacient {

    @Override
    void evaluareInitialaPacient() {
        System.out.println("Evaluare initiala pacient la camera de garda");
    }

    @Override
    void repartizarePacientSalon() {
        System.out.println("Repartizare pacient de urgenta in salonul disponibil");
    }
}