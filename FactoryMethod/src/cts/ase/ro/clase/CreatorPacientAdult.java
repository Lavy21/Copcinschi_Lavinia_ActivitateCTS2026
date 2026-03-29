package cts.ase.ro.clase;

public class CreatorPacientAdult implements ICreator{

    @Override
    public ISectie createObject() {
        return new PacientAdult();
    }
}
