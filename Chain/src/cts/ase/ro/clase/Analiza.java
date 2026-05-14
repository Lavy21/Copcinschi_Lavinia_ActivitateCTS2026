package cts.ase.ro.clase;

public class Analiza implements IItem {
    private String denumire;
    private float valoare;

    public Analiza(String denumire, float valoare) {
        this.denumire = denumire;
        this.valoare = valoare;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getValoare() {
        return valoare;
    }

    @Override
    public String getTip() {
        return "analiza";
    }

    @Override
    public String toString() {
        return "Analiza{" +
                "denumire='" + denumire + '\'' +
                ", valoare=" + valoare +
                '}';
    }
}