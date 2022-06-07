package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class XMLHandler {
    private static void writeXml(Document doc, OutputStream output) throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT,"yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount","4");
        transformer.setOutputProperty(OutputKeys.ENCODING,"UTF-8");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(output);

        transformer.transform(source,result);
    }

    public void WriteUgyfel(){
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Customers");
            doc.appendChild(rootElement);
            for (int i = 0; i<Ugyfel.lista.size();i++){
                Element user = doc.createElement("Customer");
                rootElement.appendChild(user);

                Element nev = doc.createElement("name");
                nev.setTextContent(Ugyfel.lista.get(i).getNev());
                user.appendChild(nev);

                Element lakcim = doc.createElement("lakcim");
                lakcim.setTextContent(Ugyfel.lista.get(i).getLakcim());
                user.appendChild(lakcim);

                Element anyjaneve = doc.createElement("anyjaneve");
                anyjaneve.setTextContent(Ugyfel.lista.get(i).getAnyja_neve());
                user.appendChild(anyjaneve);

                Element email = doc.createElement("email");
                email.setTextContent(Ugyfel.lista.get(i).getEmail());
                user.appendChild(email);

                Element szuldat = doc.createElement("szuletesidatum");
                szuldat.setTextContent(Ugyfel.lista.get(i).getSzuldat());
                user.appendChild(szuldat);

                Element id = doc.createElement("id");
                id.setTextContent(Integer.toString(Ugyfel.lista.get(i).getId()));
                user.appendChild(id);


                try(FileOutputStream outputStream = new FileOutputStream("ugyfelek.xml") ){
                    writeXml(doc,outputStream);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }

        }catch (Exception e){
            System.out.println("Hiba: ");
            e.printStackTrace();
        }
        System.out.println("Sikeres mentés!");
    }

    public void WriteAuto(){
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Cars");
            doc.appendChild(rootElement);
            for (int i = 0; i< AutoInsurance.lista.size(); i++){
                Element user = doc.createElement("Car");
                rootElement.appendChild(user);

                Element tonna = doc.createElement("tonna");
                tonna.setTextContent(Boolean.toString(AutoInsurance.lista.get(i).isTonna()));
                user.appendChild(tonna);

                Element rendszam = doc.createElement("rendszam");
                rendszam.setTextContent(AutoInsurance.lista.get(i).getRendszam());
                user.appendChild(rendszam);

                Element gyartasiev = doc.createElement("gyartasiev");
                gyartasiev.setTextContent(AutoInsurance.lista.get(i).getGyartasiev());
                user.appendChild(gyartasiev);

                Element teljesitmeny = doc.createElement("teljesitmeny");
                teljesitmeny.setTextContent(Integer.toString(AutoInsurance.lista.get(i).getEmail()));
                user.appendChild(teljesitmeny);

                Element id = doc.createElement("id");
                id.setTextContent(Integer.toString(AutoInsurance.lista.get(i).getId()));
                user.appendChild(id);

                try(FileOutputStream outputStream = new FileOutputStream("auto.xml") ){
                    writeXml(doc,outputStream);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }

        }catch (Exception e){
            System.out.println("Hiba: ");
            e.printStackTrace();
        }
        System.out.println("Sikeres mentés!");
    }
    public void WriteLakas(){
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Properties");
            doc.appendChild(rootElement);
            for (int i = 0; i< LakasInsurance.lista.size(); i++){
                Element user = doc.createElement("Property");
                rootElement.appendChild(user);

                Element biztaddress = doc.createElement("tonna");
                biztaddress.setTextContent(Boolean.toString(LakasInsurance.lista.get(i).getBizt_address()));
                user.appendChild(biztaddress);

                Element ingatlantype = doc.createElement("ingatlantype");
                ingatlantype.setTextContent(LakasInsurance.lista.get(i).getIngatlantype());
                user.appendChild(ingatlantype);

                Element mellekepuletekszama = doc.createElement("mellekepuletek");
                mellekepuletekszama.setTextContent(Integer.toString(LakasInsurance.lista.get(i).getMellek_buildings()));
                user.appendChild(mellekepuletekszama);

                Element lakott = doc.createElement("lakottság");
                lakott.setTextContent(LakasInsurance.lista.get(i).isLakott_area());
                user.appendChild(lakott);

                Element id = doc.createElement("id");
                id.setTextContent(Integer.toString(LakasInsurance.lista.get(i).getId()));
                user.appendChild(id);

                try(FileOutputStream outputStream = new FileOutputStream("property.xml") ){
                    writeXml(doc,outputStream);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }

        }catch (Exception e){
            System.out.println("Hiba: ");
            e.printStackTrace();
        }
        System.out.println("Sikeres mentés!");
    }

    public void WriteElet(){
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Lives");
            doc.appendChild(rootElement);
            for (int i = 0; i< EletInsurance.lista.size(); i++){
                Element user = doc.createElement("Life");
                rootElement.appendChild(user);

                Element fogyatekos = doc.createElement("fogyatekos");
                fogyatekos.setTextContent(Boolean.toString(EletInsurance.lista.get(i).isFogyatekos()));
                user.appendChild(fogyatekos);

                Element eletkor = doc.createElement("eletkor");
                eletkor.setTextContent(Integer.toString(EletInsurance.lista.get(i).getEletkor()));
                user.appendChild(eletkor);

                Element kronikus = doc.createElement("kronikus");
                kronikus.setTextContent(Boolean.toString(EletInsurance.lista.get(i).isKronikus()));
                user.appendChild(kronikus);

                Element halalos = doc.createElement("halalos");
                halalos.setTextContent(Boolean.toString(EletInsurance.lista.get(i).isKronikus()));
                user.appendChild(halalos);

                Element id = doc.createElement("id");
                id.setTextContent(Integer.toString(EletInsurance.lista.get(i).getId()));
                user.appendChild(id);

                try(FileOutputStream outputStream = new FileOutputStream("life.xml") ){
                    writeXml(doc,outputStream);
                }catch (Exception ex){
                    ex.printStackTrace();
                }
            }

        }catch (Exception e){
            System.out.println("Hiba: ");
            e.printStackTrace();
        }
        System.out.println("Sikeres mentés!");
    }

}
