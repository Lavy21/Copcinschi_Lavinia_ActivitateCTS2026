package cts.ase.ro.composite;

public abstract class ANod {
    public abstract String getDenumire();
    public abstract int getNrCazuri();
    public String getInfo(){
        return this.getDenumire() + " " + this.getNrCazuri();
    };
    public void adaugaNod(ANod nod) {
        throw new UnsupportedOperationException();
    }
    public void eliminaNod(ANod nod) {
        throw new UnsupportedOperationException();
    }
    public ANod getNod(int index) {
        throw new UnsupportedOperationException();
    }
}
