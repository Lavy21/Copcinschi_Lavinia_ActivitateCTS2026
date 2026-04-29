package cts.ase.ro.clase;

public class AnalizaLaborator {
   private Analiza analiza;
   public AnalizaLaborator(Analiza analiza) {
        super();
        this.analiza = analiza;
    }
    public void programeazaAnaliza() {
        System.out.println("A fost realizata o programare pentru analiza de laborator");
    }

    @Override
    public String toString() {
        return "Analiza selectata este " + analiza.getTipAnaliza() +
                ", cu pretul de " + analiza.getPret() + " lei";
    }
}