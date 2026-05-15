package cts.ase.ro.main;

import cts.ase.ro.composite.ANod;
import cts.ase.ro.composite.Structura;
import cts.ase.ro.composite.TulpinaVirus;
import cts.ase.ro.proxy.ISpital;
import cts.ase.ro.proxy.ProxySpital;
import cts.ase.ro.proxy.Spital;
import cts.ase.ro.proxy.Vizitator;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== TEST PROXY ===");
        Vizitator vizitator1 = new Vizitator("Popescu Ana", true);
        Vizitator vizitator2 = new Vizitator("Ionescu Mihai", true);
        Vizitator vizitator3 = new Vizitator("Georgescu Elena", false);
        Vizitator vizitator4 = new Vizitator("Marin Andrei", true);
        Vizitator vizitator5 = new Vizitator("Dobre Ioana", true);
        ISpital spital = new Spital();
        ISpital proxySpital = new ProxySpital(spital);
        proxySpital.permiteAccesSalon(vizitator1);
        proxySpital.permiteAccesSalon(vizitator2);
        proxySpital.permiteAccesSalon(vizitator3);
        proxySpital.permiteAccesSalon(vizitator4);
        proxySpital.permiteAccesSalon(vizitator5);
        System.out.println();
        System.out.println("TEST COMPOSITE:");
        Structura glob = new Structura("Glob");
        Structura europa = new Structura("Europa");
        Structura asia = new Structura("Asia");
        Structura romania = new Structura("Romania");
        Structura germania = new Structura("Germania");
        Structura japonia = new Structura("Japonia");
        ANod tulpina1 = new TulpinaVirus("Covid", 1200, "aeriana", 2.5f);
        ANod tulpina2 = new TulpinaVirus("Gripa A", 800, "contact", 0.8f);
        ANod tulpina3 = new TulpinaVirus("Gripa B", 400, "alimentara", 0.2f);
        ANod tulpina4 = new TulpinaVirus("Gripa C", 950, "aeriana", 1.1f);
        ANod tulpina5 = new TulpinaVirus("SARS", 150, "aeriana", 9.5f);
        ANod tulpina6 = new TulpinaVirus("Hantavirus", 600, "contact", 0.5f);
        romania.adaugaNod(tulpina1);
        romania.adaugaNod(tulpina2);
        germania.adaugaNod(tulpina3);
        germania.adaugaNod(tulpina4);
        japonia.adaugaNod(tulpina5);
        japonia.adaugaNod(tulpina6);
        europa.adaugaNod(romania);
        europa.adaugaNod(germania);
        asia.adaugaNod(japonia);
        glob.adaugaNod(europa);
        glob.adaugaNod(asia);
        System.out.println(glob.getInfo());
        System.out.println("Numarul total de cazuri este: " + glob.getNrCazuri());
    }
}