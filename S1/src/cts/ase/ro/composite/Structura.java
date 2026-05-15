package cts.ase.ro.composite;
import java.util.ArrayList;

public class Structura extends ANod {
    private String denumire;
    private ArrayList<ANod> noduri;

    public Structura(String denumire) {
        this.denumire = denumire;
        this.noduri = new ArrayList<ANod>();
    }

    @Override
    public String getDenumire() {
        return denumire;
    }

    @Override
    public int getNrCazuri() {
        int total = 0;
        for (ANod nod : noduri) {
            total += nod.getNrCazuri();
        }
        return total;
    }

    @Override
    public String getInfo() {
        String info = "";
        info += this.denumire + "\n";
        for (ANod nod : noduri) {
            info += " " + nod.getInfo();
            info += "\n";
        }
        return info;
    }

    @Override
    public void adaugaNod(ANod nod) {
        noduri.add(nod);
    }

    @Override
    public void eliminaNod(ANod nod) {
        noduri.remove(nod);
    }

    @Override
    public ANod getNod(int index) {
        return noduri.get(index);
    }
}