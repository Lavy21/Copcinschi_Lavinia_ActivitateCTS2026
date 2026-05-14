package cts.ase.ro.clase;

public interface IHandler {
    void filtrare(DosarPacient dosar);
    void setNextHandler(IHandler nextHandler);
    IHandler getNextHandler();
}