package cts.ase.ro.clase;
import java.util.ArrayList;
import java.util.List;

public class ColectieAsistenti {
    private List<Asistent> listaAsistenti = new ArrayList<Asistent>();
    public void addAsistent(Asistent asistent) {
        listaAsistenti.add(asistent);
    }

    public int getNrAsistentiLiberiData(String data) {
        int contor = 0;
        for (Asistent asistent : listaAsistenti) {
            if (!asistent.isEsteOcupat()) {
                contor++;
            }
        }
        return contor;
    }
}