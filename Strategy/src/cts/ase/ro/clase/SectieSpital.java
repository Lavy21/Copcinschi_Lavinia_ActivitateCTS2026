package cts.ase.ro.clase;
import java.util.ArrayList;

public class SectieSpital {
    private ArrayList<Pacient> listaPacienti = new ArrayList<Pacient>();
    private IProcesabil strategieAlegere;
    public void addPacient(Pacient pacient) {
        this.listaPacienti.add(pacient);
    }
    public void setStrategieAlegere(IProcesabil strategieAlegere) {
        this.strategieAlegere = strategieAlegere;
    }
    public Pacient alegerePacient() {
        if (strategieAlegere != null) {
            return strategieAlegere.alegerePacient(listaPacienti);
        } else {
            throw new UnsupportedOperationException();
        }
    }
}