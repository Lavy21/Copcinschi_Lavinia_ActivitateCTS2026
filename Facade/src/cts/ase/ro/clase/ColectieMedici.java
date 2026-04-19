package cts.ase.ro.clase;
import java.util.ArrayList;
import java.util.List;

public class ColectieMedici {
    private List<Medic> listaMedici = new ArrayList<>();
    public void addMedic(Medic medic) {
        this.listaMedici.add(medic);
    }
    public int getNumarMediciLiberiData(String data) {
        int contor = 0;
        for (Medic medic : listaMedici) {
            if (!medic.isEsteOcupat()) {
                contor++;
            }
        }
        return contor;
    }
}