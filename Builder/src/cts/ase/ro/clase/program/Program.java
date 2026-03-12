package cts.ase.ro.clase.program;

import cts.ase.ro.clase.builder.BuilderAbstract;
import cts.ase.ro.clase.builder.Rezervare;
import cts.ase.ro.clase.builder.RezervareBuilder;

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
        BuilderAbstract builder=new RezervareBuilder();
        Rezervare r5= builder.setCuloareAsternut("Verde").setNrPacienti(3).build();
        Rezervare r6=new RezervareBuilder().setCuloareAsternut("Azul").build();
        System.out.println(r5.toString());
        System.out.println(r6.toString());
    }
}
