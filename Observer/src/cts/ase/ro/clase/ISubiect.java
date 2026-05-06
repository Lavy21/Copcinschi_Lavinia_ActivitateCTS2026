package cts.ase.ro.clase;

public interface ISubiect {
    void addObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyAll(String mesaj);
}