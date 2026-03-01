package Program;

import ase.cts.ro.SpitalEager;

public class Program {
    public static void main(String[] args) {
        SpitalEager primulSpital= SpitalEager.getInstanta("Municipal","Str. Marcu Resta, Nr 15", 40,50);
        System.out.println(primulSpital);
    }

}
