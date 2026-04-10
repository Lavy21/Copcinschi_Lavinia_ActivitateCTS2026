package cts.ase.ro.clase;

public abstract class ADecoratorRezervare extends ARezervare {
    protected ARezervare rezervare;
    public ADecoratorRezervare(ARezervare rezervare) {
        super();
        this.rezervare = rezervare;
    }

     @Override
    public String getDetalii() {
        return rezervare.getDetalii();
    }

    @Override
    public int getCost() {
        return rezervare.getCost();
    }
}