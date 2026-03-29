package cts.ase.ro.program;

import cts.ase.ro.Prototype;
import cts.ase.ro.Rezervare;

public class Program {
    public static void main(String[] args) {
        Prototype p=new Rezervare("Ana","0724517423","ana@abc.com");
        Prototype p2=p.clona();
        ((Rezervare)p2).setNrPacienti(2);
        System.out.println(p.toString());
        System.out.println(p2.toString());
    }
}
