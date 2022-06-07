package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
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
                teljesitmeny.setTextContent(Integer.toString(AutoInsurance.lista.get(i).getTeljesitmeny()));
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

                Element biztaddress = doc.createElement("biztaddress");
                biztaddress.setTextContent(LakasInsurance.lista.get(i).getBizt_address());
                user.appendChild(biztaddress);

                Element ingatlantype = doc.createElement("ingatlantype");
                ingatlantype.setTextContent(LakasInsurance.lista.get(i).getIngatlantype().toString());
                user.appendChild(ingatlantype);

                Element mellekepuletekszama = doc.createElement("mellekepuletek");
                mellekepuletekszama.setTextContent(Integer.toString(LakasInsurance.lista.get(i).getMellek_buildings()));
                user.appendChild(mellekepuletekszama);

                Element lakott = doc.createElement("lakottság");
                lakott.setTextContent(Boolean.toString(LakasInsurance.lista.get(i).isLakott_area()));
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

                Element ecs = doc.createElement("ecs");
                ecs.setTextContent(Boolean.toString(EletInsurance.lista.get(i).isEcs()));
                user.appendChild(ecs);

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

    public void FileLoadUgyfel(){
        //read
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(new File("ugyfelek.xml"));

            NodeList list = document.getElementsByTagName("Ugyfel");
            manageNodeUgyfel(list);
            System.out.println("Sikeres betöltés!");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //Ez a metódus felel a Nodelistbe előzőlegesen betöltött adatok betöltéséért az Ugyfel Classba, vagyis az adatokat betöltjük a programba az XML fájlból.
    private static void manageNodeUgyfel(NodeList nodeList) {
        for (int count = 0;count < nodeList.getLength();count++){
            Node tmpNode = nodeList.item(count);
            if (tmpNode.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) tmpNode;
                String name = element.getElementsByTagName("name").item(0).getTextContent();
                String lakcim = element.getElementsByTagName("lakcim").item(0).getTextContent();
                String anyjaneve = String.valueOf(element.getElementsByTagName("anyjaneve").item(0).getTextContent());
                String email = String.valueOf(element.getElementsByTagName("email").item(0).getTextContent());
                String szuletesidatum = String.valueOf(element.getElementsByTagName("szuletesidatum").item(0).getTextContent());
                Integer id = Integer.valueOf(element.getElementsByTagName("id").item(0).getTextContent());
                Ugyfel ugyfel = new Ugyfel(id,name,lakcim,anyjaneve,email,szuletesidatum);
                Ugyfel.lista.add(ugyfel);
            }
        }
    }

    public void FileLoadAuto(){
        //read
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(new File("auto.xml"));

            NodeList list = document.getElementsByTagName("Car");
            manageNodeUgyfel(list);
            System.out.println("Sikeres betöltés!");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //Ez a metódus felel a Nodelistbe előzőlegesen betöltött adatok betöltéséért az AutoInsurance Classba, vagyis az adatokat betöltjük a programba az XML fájlból.
    private static void manageNodeAuto(NodeList nodeList) {
        for (int count = 0;count < nodeList.getLength();count++){
            Node tmpNode = nodeList.item(count);
            if (tmpNode.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) tmpNode;
                Boolean tonna =Boolean.valueOf(element.getElementsByTagName("tonna").item(0).getTextContent()) ;
                String rendszam = element.getElementsByTagName("rendszam").item(0).getTextContent();
                String gyartasiev = String.valueOf(element.getElementsByTagName("gyartasiev").item(0).getTextContent());
                Integer teljesitmeny = Integer.valueOf(element.getElementsByTagName("email").item(0).getTextContent());
                Integer id = Integer.valueOf(element.getElementsByTagName("id").item(0).getTextContent());
                AutoInsurance auto = new AutoInsurance(id,tonna,rendszam,gyartasiev,teljesitmeny);
                AutoInsurance.lista.add(auto);
            }
        }
    }

    public void FileLoadProperty(){
        //read
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(new File("property.xml"));

            NodeList list = document.getElementsByTagName("Property");
            manageNodeUgyfel(list);
            System.out.println("Sikeres betöltés!");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //Ez a metódus felel a Nodelistbe előzőlegesen betöltött adatok betöltéséért az AutoInsurance Classba, vagyis az adatokat betöltjük a programba az XML fájlból.
    private static void manageNodeProperty(NodeList nodeList) {
        for (int count = 0;count < nodeList.getLength();count++){
            Node tmpNode = nodeList.item(count);
            if (tmpNode.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) tmpNode;
                String biztaddress =element.getElementsByTagName("biztaddress").item(0).getTextContent() ;
                IngatlanType ingatlantype =IngatlanType.valueOf(element.getElementsByTagName("ingatlantype").item(0).getTextContent()) ;
                Integer mellekepuletek = Integer.valueOf(element.getElementsByTagName("mellekepuletek").item(0).getTextContent());
                Boolean lakottsag = Boolean.valueOf(element.getElementsByTagName("lakottsag").item(0).getTextContent());
                Integer id = Integer.valueOf(element.getElementsByTagName("id").item(0).getTextContent());
                LakasInsurance lakas = new LakasInsurance(id,biztaddress,ingatlantype,mellekepuletek,lakottsag);
                LakasInsurance.lista.add(lakas);
            }
        }
    }
    public void FileLoadLife(){
        //read
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(new File("life.xml"));

            NodeList list = document.getElementsByTagName("Life");
            manageNodeUgyfel(list);
            System.out.println("Sikeres betöltés!");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    //Ez a metódus felel a Nodelistbe előzőlegesen betöltött adatok betöltéséért az AutoInsurance Classba, vagyis az adatokat betöltjük a programba az XML fájlból.
    private static void manageNodeLife(NodeList nodeList) {
        for (int count = 0;count < nodeList.getLength();count++){
            Node tmpNode = nodeList.item(count);
            if (tmpNode.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) tmpNode;
                Boolean fogyatekos = Boolean.valueOf(element.getElementsByTagName("fogyatekos").item(0).getTextContent()) ;
                Integer eletkor =Integer.valueOf(element.getElementsByTagName("eletkor").item(0).getTextContent());
                Boolean kronikus = Boolean.valueOf(element.getElementsByTagName("kronikus").item(0).getTextContent());
                Boolean halalos = Boolean.valueOf(element.getElementsByTagName("halalos").item(0).getTextContent());
                Boolean ecs = Boolean.valueOf(element.getElementsByTagName("ecs").item(0).getTextContent());
                Integer id = Integer.valueOf(element.getElementsByTagName("id").item(0).getTextContent());
                EletInsurance life = new EletInsurance(id,fogyatekos,eletkor,kronikus,halalos,ecs);
                EletInsurance.lista.add(life);
            }
        }
    }





    public void FileChecker(){
        File fileugyfel = new File("ugyfelek.xml");
        if (fileugyfel.exists()){
            FileLoadUgyfel();
        }else{
            WriteUgyfel();
        }
        File fileauto = new File("auto.xml");
        if (fileugyfel.exists()){
            FileLoadAuto();
        }else{
            WriteAuto();
        }
        File fileproperty = new File("property.xml");
        if (fileproperty.exists()){
            FileLoadProperty();
        }else{
            WriteLakas();
        }
        File filelife = new File("life.xml");
        if (filelife.exists()){
            FileLoadLife();
        }else{
            WriteElet();
        }


    }

}
