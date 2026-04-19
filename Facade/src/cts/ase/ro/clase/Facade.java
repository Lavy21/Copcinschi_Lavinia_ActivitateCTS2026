package cts.ase.ro.clase;

public class Facade {
    private ColectieMedici colectieMedici = new ColectieMedici();
    private ColectieAsistenti colectieAsistenti = new ColectieAsistenti();
    public void addMedic(Medic medic) {
        colectieMedici.addMedic(medic);
    }
    public void addAsistent(Asistent asistent) {
        colectieAsistenti.addAsistent(asistent);
    }
    public boolean verificaDisponibilitateData(String data, int nrPacienti) {
        int contorMedici = colectieMedici.getNumarMediciLiberiData(data);
        int contorAsistenti = colectieAsistenti.getNrAsistentiLiberiData(data);
        if (nrPacienti <= contorMedici * 2 && nrPacienti <= contorAsistenti * 3) {
            return true;
        } else {
            return false;
        }
    }
}