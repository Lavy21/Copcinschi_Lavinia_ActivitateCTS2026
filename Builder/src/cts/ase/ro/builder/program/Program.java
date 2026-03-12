package cts.ase.ro.builder.program;

import cts.ase.ro.builder.clase.Rezervare;

public class Program {
    public static void main(String[] args) {
        Rezervare r1=new Rezervare(false,false,"Alb","Drama",5);
        Rezervare r2=new Rezervare(true,false,"Rosu","Thriller",5);
        Rezervare r3= new Rezervare();
        r3.setCuloareAsternut("Gri");
        r3.setGenProgrameTV("Sci-FI");
        System.out.println(r1.toString());
        System.out.println(r2.toString());
        System.out.println(r3.toString());
    }
}
