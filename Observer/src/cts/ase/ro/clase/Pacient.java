package cts.ase.ro.clase;

public class Pacient implements IObserver {
    private String nume;
    public Pacient(String nume) {
       super();
       this.nume = nume;
    }

    @Override
    public void getMesaj(String mesaj) {
        System.out.println("Pacientul " + this.nume + " a primit mesajul: " + mesaj);
    }
}