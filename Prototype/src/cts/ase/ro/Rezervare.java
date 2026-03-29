package cts.ase.ro;

public class Rezervare implements Prototype{
private  String nume;
private String nrTel;
private String email;
private int nrPacienti;

    public Rezervare(String nume, String nrTel, String email) {
        if(nume.length()>3){
        this.nume = nume;}
        else {this.nume = "Necunoscut";}
        if(nrTel.length()==10){
            this.nrTel = nrTel;} else {this.nrTel = "0000000000";}
        this.email = email;
        this.nrPacienti = 0;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNrTel(String nrTel) {
        this.nrTel = nrTel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNrPacienti(int nrPacienti) {
        this.nrPacienti = nrPacienti;
    }

    private Rezervare(){
        this.nume = "Necunoscut";
        this.nrTel = "0000000000";
        this.email = "Necunoscut";
        this.nrPacienti = 0;
    }
    @Override
    public Prototype clona() {
        Rezervare r = new Rezervare();
        r.nume = this.nume;
        r.nrTel = this.nrTel;
        r.email = this.email;
        r.nrPacienti = this.nrPacienti;
        return r;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTel='").append(nrTel).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", nrPacienti=").append(nrPacienti);
        sb.append('}');
        return sb.toString();
    }
}
