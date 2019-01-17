package testspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		// Créé un contexte Spring
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");

		// Donne moi l'objet de type GestionStock
		GestionStock gestionStock = appContext.getBean(GestionStock.class);

		// Appelle la méthode inventaire.
		gestionStock.inventaire();
	}

}
