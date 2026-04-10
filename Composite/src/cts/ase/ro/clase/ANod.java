package cts.ase.ro.clase;

public abstract class ANod {
    public abstract String getDenumire();
    public abstract int getNrLocuri();
    public String getInfo() {
        return this.getDenumire() + " " + this.getNrLocuri();
    }

    public void adaugaNod(ANod elemStructura) {
        throw new UnsupportedOperationException();
    }

    public void eliminaNod(ANod elemStructura) {
        throw new UnsupportedOperationException();
    }

    public ANod getNod(int i) {
        throw new UnsupportedOperationException();
    }
}