package cts.ase.ro.program;

import cts.ase.ro.clase.*;

public class ProgramFM {
    private static void creazaSectii(ICreator creatorSectie,String tipSectie){
        ISectie sectie= creatorSectie.createObject();
        sectie.sectie(tipSectie);
    }
    public static void main(String[] args) {
        creazaSectii(new CreatorPacientCopil(),"Pediatrie");
        creazaSectii(new CreatorPacientAdult(),"Cardiologie");
        creazaSectii(new CreatorPacientPensionar(),"Geriatrie");
        creazaSectii(new CreatorPacientAdult(),"Neurologie");
    }
}
