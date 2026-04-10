package cts.ase.ro.program;
import cts.ase.ro.clase.ANod;
import cts.ase.ro.clase.Salon;
import cts.ase.ro.clase.Sectie;
import cts.ase.ro.clase.Spital;

public class Program {
    public static void main(String[] args) {
        Sectie structuraSpital = new Sectie("Structura spital");
        Spital spital = new Spital(structuraSpital, "Spitalul Universitar");
        ANod structuraMedicala = new Sectie("Sectie medicala");
        ANod structuraChirurgicala = new Sectie("Sectie chirurgicala");
        structuraSpital.adaugaNod(structuraMedicala);
        structuraSpital.adaugaNod(structuraChirurgicala);
        Sectie structuraCardiologie = new Sectie("Cardiologie");
        Sectie structuraNeurologie = new Sectie("Neurologie");
        structuraMedicala.adaugaNod(structuraCardiologie);
        structuraMedicala.adaugaNod(structuraNeurologie);
        Sectie structuraOrtopedie = new Sectie("Ortopedie");
        Sectie structuraChirurgie = new Sectie("Chirurgie generala");
        structuraChirurgicala.adaugaNod(structuraOrtopedie);
        structuraChirurgicala.adaugaNod(structuraChirurgie);
        structuraCardiologie.adaugaNod(new Salon("Salon 101", 2));
        structuraCardiologie.adaugaNod(new Salon("Salon 102", 3));
        structuraNeurologie.adaugaNod(new Salon("Salon 201", 2));
        structuraOrtopedie.adaugaNod(new Salon("Salon 301", 4));
        structuraOrtopedie.adaugaNod(new Salon("Salon 302", 2));
        structuraChirurgie.adaugaNod(new Salon("Salon 401", 3));
        System.out.println(spital.getNumeSpital());
        System.out.println(structuraSpital.getInfo());
    }
}