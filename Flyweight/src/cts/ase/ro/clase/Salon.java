package cts.ase.ro.clase;

public class Salon implements IFlyweight {

    private int nrSalon;
    private int nrPaturi;
    private String sectie;

    Salon(int nrSalon, int nrPaturi, String sectie) {
        super();
        this.nrSalon = nrSalon;
        this.nrPaturi = nrPaturi;
        this.sectie = sectie;
        System.out.println("A fost creat obiectul salon cu nr " + this.nrSalon);
    }

    public int getNrSalon() {
        return nrSalon;
    }

    public int getNrPaturi() {
        return nrPaturi;
    }

    public String getSectie() {
        return sectie;
    }

    @Override
    public void interneazaPacient(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() +
                " in varsta de " + pacient.getVarsta() +
                " ani este internat in salonul " + this.nrSalon +
                " din sectia " + this.sectie +
                " pe patul " + pacient.getNrPat() + ".");
    }
}