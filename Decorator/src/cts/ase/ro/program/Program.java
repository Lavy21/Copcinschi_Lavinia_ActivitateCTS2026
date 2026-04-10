package cts.ase.ro.program;

import cts.ase.ro.clase.ARezervare;
import cts.ase.ro.clase.DecoratorMeniuSpecial;
import cts.ase.ro.clase.DecoratorPatApartinator;
import cts.ase.ro.clase.RezervareSalon;

public class Program {
    public static void main(String[] args) {
        ARezervare rezervare = new RezervareSalon();
        System.out.println(rezervare.getDetalii());
        System.out.println(rezervare.getCost());
        ARezervare rezervareDecorata = new DecoratorMeniuSpecial(rezervare);
        System.out.println(rezervareDecorata.getDetalii());
        System.out.println(rezervareDecorata.getCost());
        ARezervare rezervareDecorataMultiplu = new DecoratorPatApartinator(new DecoratorMeniuSpecial(new RezervareSalon()), 3);
        System.out.println(rezervareDecorataMultiplu.getDetalii());
        System.out.println(rezervareDecorataMultiplu.getCost());
    }
}