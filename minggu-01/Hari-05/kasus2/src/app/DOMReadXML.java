package app;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class DOMReadXML{
    public static void main(String[] args) {
        try {
            File xmlFile = new File("/home/pika/praxis-academy/minggu-01/Hari-05/kasus2/src/app/input.xml");
            DocumentBuilderFactory dbFactory=DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder=dbFactory.newDocumentBuilder();
            Document doc= docBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            System.out.println("Element akar : "+doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("Anggota");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node=nodeList.item(i);
                System.out.println("\nCurrent Elemen : "+node.getNodeName());
                if (node.getNodeType()==Node.ELEMENT_NODE) {
                    Element element=(Element) node;
                    System.out.println("ID : " + element.getElementsByTagName("id").item(0).getTextContent());
                    System.out.println("Nama : " + element.getElementsByTagName("nama").item(0).getTextContent());
                    System.out.println("Alamat : " + element.getElementsByTagName("Alamat").item(0).getTextContent());
                }
            }
            NodeList nodeListD = doc.getElementsByTagName("Team");
            Node nodeD=nodeListD.item(0);
            System.out.println("\nCurrent Elemen : "+nodeD.getNodeName());
            if (nodeD.getNodeType()==Node.ELEMENT_NODE) {
                Element elementD=(Element) nodeD;
                System.out.println("Hari ke : " + elementD.getElementsByTagName("Day").item(0).getTextContent());
                System.out.println("Lokasi : " + elementD.getElementsByTagName("Lokasi").item(0).getTextContent());
            }
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}