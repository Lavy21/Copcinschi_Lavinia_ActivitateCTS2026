package cts.ase.ro.clase;

public class RezervareSalon extends ARezervare {

    @Override
    public String getDetalii() {
        return "rezervare salon standard, 2 paturi, baie proprie";
    }

    @Override
    public int getCost() {
        return 300;
    }
}