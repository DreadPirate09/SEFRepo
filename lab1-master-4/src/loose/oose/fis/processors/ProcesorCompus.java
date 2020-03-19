package loose.oose.fis.processors;

import loose.oose.fis.documents.Document;

import java.util.ArrayList;

public class ProcesorCompus implements Procesor {
    private ArrayList<Procesor> procesoare = new ArrayList<>();

    public void adaugaProcesor(Procesor procesor) {
        procesoare.add(procesor);
    }

    @Override
    public int proceseaza(ArrayList<Document> documente) {
        int res = 0;

        for (Procesor procesor : procesoare) {
            res += procesor.proceseaza(documente);
        }

        return res;
    }
}
