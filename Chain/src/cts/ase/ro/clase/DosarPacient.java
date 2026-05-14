package cts.ase.ro.clase;

import java.util.List;

public class DosarPacient {
    private List<IItem> itemi;
    private String numePacient;

    public DosarPacient(List<IItem> itemi, String numePacient) {
        this.itemi = itemi;
        this.numePacient = numePacient;
    }

    public List<IItem> getItemi() {
        return itemi;
    }

    public void setItemi(List<IItem> itemi) {
        this.itemi = itemi;
    }

    public void removeItem(IItem item) {
        itemi.remove(item);
    }

    public IItem getItem(int index) {
        return itemi.get(index);
    }

    @Override
    public String toString() {
        return "DosarPacient{" +
                "itemi=" + itemi +
                ", numePacient='" + numePacient + '\'' +
                '}';
    }
}