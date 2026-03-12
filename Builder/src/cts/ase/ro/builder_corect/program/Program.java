package cts.ase.ro.builder_corect.program;

import cts.ase.ro.builder_corect.RezervareFinala;

public class Program {
    public static void main(String[] args) {
        RezervareFinala rf=new RezervareFinala.Builder().setNrPacienti(8).build();
        System.out.println(rf.toString());
    }
}
