package cts.ase.ro.clase;

public abstract class AInternarePacient {
    final void verificareDocumente() {
        System.out.println("S-a facut verificarea documentelor pacientului");
    }
    abstract void evaluareInitialaPacient();
    abstract void repartizarePacientSalon();
    public final void proceduraInternarePacient() {
        verificareDocumente();
        evaluareInitialaPacient();
        repartizarePacientSalon();
    }
}