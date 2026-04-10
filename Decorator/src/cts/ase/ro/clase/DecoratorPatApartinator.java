package cts.ase.ro.clase;

public class DecoratorPatApartinator extends ADecoratorRezervare {
    private int nrZile;
    public DecoratorPatApartinator(ARezervare rezervare, int nrZile) {
        super(rezervare);
        this.nrZile = nrZile;
    }

    @Override
    public String getDetalii() {
        return super.getDetalii() + ", pat pentru apartinator " + this.nrZile + " zile";
    }

    @Override
    public int getCost() {
        return super.getCost() + 100 * this.nrZile;
    }
}