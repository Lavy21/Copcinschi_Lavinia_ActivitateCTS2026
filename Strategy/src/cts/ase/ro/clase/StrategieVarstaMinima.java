package cts.ase.ro.clase;
import java.util.ArrayList;

public class StrategieVarstaMinima implements IProcesabil {
    @Override
    public Pacient alegerePacient(ArrayList<Pacient> listaPacienti) {
        Pacient pacientVarstaMinima = listaPacienti.get(0);
        for (Pacient pacient : listaPacienti) {
            if (pacient.getVarsta() < pacientVarstaMinima.getVarsta()) {
                pacientVarstaMinima = pacient;
            }
        }
        return pacientVarstaMinima;
    }
}