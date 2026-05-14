package cts.ase.ro.clase;

public class Observatie implements IItem {

    private String text;
    private String culoare;
    private boolean esteImportanta;

    public Observatie(String text, String culoare, boolean esteImportanta) {
        this.text = text;
        this.culoare = culoare;
        this.esteImportanta = esteImportanta;
    }

    public String getText() {
        return text;
    }

    public String getCuloare() {
        return culoare;
    }

    public boolean isEsteImportanta() {
        return esteImportanta;
    }

    @Override
    public String getTip() {
        return "observatie";
    }

    @Override
    public String toString() {
        return "Observatie{" +
                "text='" + text + '\'' +
                ", culoare='" + culoare + '\'' +
                ", esteImportanta=" + esteImportanta +
                '}';
    }
}