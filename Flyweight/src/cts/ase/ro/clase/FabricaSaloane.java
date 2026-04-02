package cts.ase.ro.clase;
import java.util.HashMap;

public class FabricaSaloane {
    private static HashMap<Integer, IFlyweight> listaSaloane = new HashMap<>();
    private static int nrPacientiInternati = 0;
    public static IFlyweight getSalon(int nrSalon, int nrPaturi, String sectie) {
        IFlyweight salon = listaSaloane.get(nrSalon);
        if (salon == null) {
            salon = new Salon(nrSalon, nrPaturi, sectie);
            listaSaloane.put(nrSalon, salon);
        }
        return salon;
    }

    public static void crestereInternari() {
        nrPacientiInternati++;
    }
    public static int getNrPacientiInternati() {
        return nrPacientiInternati;
    }
    public static int getNrSaloane() {
        return listaSaloane.size();
    }
}