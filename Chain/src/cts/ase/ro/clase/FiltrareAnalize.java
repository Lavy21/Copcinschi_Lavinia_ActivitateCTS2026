package cts.ase.ro.clase;

import java.util.ArrayList;
import java.util.List;

public class FiltrareAnalize extends AHandler {

    @Override
    public void filtrare(DosarPacient dosar) {
        List<IItem> copie = new ArrayList<>();
        for (IItem item : dosar.getItemi()) {
            if (!item.getTip().equals("analiza")) {
                copie.add(item);
            }
        }
        dosar.setItemi(copie);
        super.filtrare(dosar);
    }
}