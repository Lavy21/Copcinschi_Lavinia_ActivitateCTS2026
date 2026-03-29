package cts.ase.ro.clase;

public class CreatorPacientCopil implements ICreator{

   @Override
    public ISectie createObject() {
        return new PacientCopil();
    }
}
