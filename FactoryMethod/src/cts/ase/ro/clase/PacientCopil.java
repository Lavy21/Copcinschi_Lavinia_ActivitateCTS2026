package cts.ase.ro.clase;

public class PacientCopil implements ISectie{

    @Override
    public void sectie(String tipSectie) {
        System.out.println("In sectiile "+tipSectie+" sunt tratati pacienti copii");
    }
}
