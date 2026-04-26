package cts.ase.ro.clase;
import java.util.ArrayList;

public class StrategieUrgentaMaxima implements IProcesabil {

    @Override
    public Pacient alegerePacient(ArrayList<Pacient> listaPacienti) {
        Pacient pacientUrgentaMaxima = listaPacienti.get(0);
        for (Pacient pacient : listaPacienti) {
            if (pacient.getGradUrgenta() > pacientUrgentaMaxima.getGradUrgenta()) {
                pacientUrgentaMaxima = pacient;
            }
        }
        return pacientUrgentaMaxima;
    }
}