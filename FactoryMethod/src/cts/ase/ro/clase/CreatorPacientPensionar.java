package cts.ase.ro.clase;

public class CreatorPacientPensionar implements ICreator{
    @Override
    public ISectie createObject() {
        return new PacientPensionar();
    }
}
