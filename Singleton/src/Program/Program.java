package Program;

import ase.cts.ro.eager.SpitalEager;
import ase.cts.ro.staticblock.SpitalStaticBlock;

public class Program {
    public static void main(String[] args) {

        System.out.println("Eager Initialization");
        SpitalEager spitalEager1 = SpitalEager.getInstanta();
        SpitalEager spitalEager2 = SpitalEager.getInstanta();

        System.out.println(spitalEager1);
        System.out.println(spitalEager2);

        spitalEager1.setNumeSpital("Spital Judetean");
        System.out.println("Dupa modificare:");
        System.out.println(spitalEager1);
        System.out.println(spitalEager2);

        System.out.println();

        System.out.println("Static Block");
        SpitalStaticBlock spitalStatic1 = SpitalStaticBlock.getInstanta();
        SpitalStaticBlock spitalStatic2 = SpitalStaticBlock.getInstanta();

        System.out.println(spitalStatic1);
        System.out.println(spitalStatic2);

        spitalStatic1.setNumeSpital("Spital Municipal");
        System.out.println("Dupa modificare:");
        System.out.println(spitalStatic1);
        System.out.println(spitalStatic2);
    }
}