package cts.ase.ro.clase;

public class DecoratorMeniuSpecial extends ADecoratorRezervare {
    public DecoratorMeniuSpecial(ARezervare rezervare) {
        super(rezervare);
    }

    @Override
    public String getDetalii() {
       return super.getDetalii() + ", meniu special pentru pacient";
    }

    @Override
    public int getCost() {
        return super.getCost() + 50;
    }
}