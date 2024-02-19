import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Scanner;

public class mainEnun2 {
    public static void main(String[] args) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            File file = new File("resources/enun1.xml");
            Document document = documentBuilder.parse(file);

            Element elementoRaiz = document.getDocumentElement();


            Element elementoTitulo = (Element) elementoRaiz.getElementsByTagName("titulo").item(0);


            Element elementoCategoria = (Element) elementoRaiz.getElementsByTagName("categoria").item(0);


            Element elementoDescripcion = (Element) elementoRaiz.getElementsByTagName("descripcion").item(0);


            Element elementoAutor = (Element) elementoRaiz.getElementsByTagName("autor").item(0);
            String atributoTwitter = elementoAutor.getAttribute("twitter");
            String atributoEmail = elementoAutor.getAttribute("email");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce un autor");
            String autor = scanner.nextLine();


            if (elementoAutor.getTextContent().equals(autor)) {
                System.out.println("El autor " + autor + " es el autor de la noticia");
            } else {
                System.out.println("El autor " + autor + " no es el autor de la noticia");

            }

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}