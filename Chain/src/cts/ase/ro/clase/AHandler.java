package cts.ase.ro.clase;

public abstract class AHandler implements IHandler {
    private IHandler nextHandler;

    @Override
    public void filtrare(DosarPacient dosar) {
        if (this.getNextHandler() != null) {
            this.getNextHandler().filtrare(dosar);
        }
    }

    @Override
    public void setNextHandler(IHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public IHandler getNextHandler() {
        return nextHandler;
    }
}