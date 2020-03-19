package loose.oose.fis;

import loose.oose.fis.documents.Document;
import loose.oose.fis.documents.JSON;
import loose.oose.fis.documents.XML;
import loose.oose.fis.processors.Procesor;
import loose.oose.fis.processors.ProcesorCautare;
import loose.oose.fis.processors.ProcesorCompus;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String[] xmlList = new String[6];
        xmlList[0] = "<tag1>";
        xmlList[1] = "text1";
        xmlList[2] = "</tag1>";
        xmlList[3] = "<tag2>";
        xmlList[4] = "text2";
        xmlList[5] = "</tag2>";

        Document xml = new XML(xmlList);

        ArrayList<Document> documente = new ArrayList<>();
        documente.add(xml);

        Procesor c1 = new ProcesorCautare("text1");
        Procesor c2 = new ProcesorCautare("text3");
        Procesor c3 = new ProcesorCautare("text2");

        ProcesorCompus pc1 = new ProcesorCompus();
        pc1.adaugaProcesor(c1);
        pc1.adaugaProcesor(c2);

        ProcesorCompus pc2 = new ProcesorCompus();
        pc2.adaugaProcesor(pc1);
        pc2.adaugaProcesor(c3);

        System.out.println(pc2.proceseaza(documente));
    }
}
