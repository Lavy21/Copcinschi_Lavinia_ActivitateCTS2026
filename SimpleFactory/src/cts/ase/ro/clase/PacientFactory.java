package cts.ase.ro.clase;

public class PacientFactory {

    public Pacient createInstance(TipPacient tip) {
        switch (tip) {
            case Copil -> {
                return new Copil();
            }
            case Adult -> {
                return new Adult();
            }
            case Pensionar -> {
                return new Pensionar();
            }
            default -> {
                return null;
            }
        }
    }

}
