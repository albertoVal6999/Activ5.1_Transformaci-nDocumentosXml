import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.util.Scanner;

public class mainEnun3 {
    public static void main(String[] args) {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            File file = new File("resources/enun1.xml");
            Document document = documentBuilder.parse(file);

            Element elementoRaiz = document.getDocumentElement();
            //Para poder entrar al atrbuto email,tengo que entrar primero al elemento autor
            Element elementoAutor = (Element) elementoRaiz.getElementsByTagName("autor").item(0);
            String atributoEmail = elementoAutor.getAttribute("email");

            Scanner scanner = new Scanner(System.in);
            System.out.println("Introduce el email del autor");
            String email = scanner.nextLine();

            //En los atributos no hay que hacer el getContent(), para ver lo q hay dentro
            if (atributoEmail.equals(email)) {
                System.out.println("El email " + email + " pertenece al autor de la noticia");
            } else {
                System.out.println("El email " + email + " no pertenece al autor de la noticia");

            }

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
