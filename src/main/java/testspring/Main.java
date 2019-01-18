package testspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		System.out.println("Utilisation du contexte spring.xml");

		// Créé un contexte Spring
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");

		// Donne moi l'objet de type GestionStock
		GestionStock gestionStock = appContext.getBean(GestionStock.class);

		// Appelle la méthode inventaire.
		gestionStock.inventaire();

		System.out.println("===================================");
		System.out.println("Utilisation du contexte spring2.xml");

		appContext = new ClassPathXmlApplicationContext("spring2.xml");

		// Donne moi l'objet de type GestionStock
		gestionStock = appContext.getBean(GestionStock.class);

		// Appelle la méthode inventaire.
		gestionStock.inventaire();

		System.out.println("===================================");
		System.out.println("Utilisation du contexte spring3.xml");

		appContext = new ClassPathXmlApplicationContext("spring3.xml");

		// Donne moi l'objet de type GestionStock
		gestionStock = appContext.getBean(GestionStock.class);

		// Appelle la méthode inventaire.
		gestionStock.inventaire();

		System.out.println("===================================");
		System.out.println("Utilisation du contexte spring4.xml");

		appContext = new ClassPathXmlApplicationContext("spring4.xml");

		// Donne moi l'objet de type GestionStock
		gestionStock = appContext.getBean(GestionStock.class);

		// Appelle la méthode inventaire.
		gestionStock.inventaire();

	}

}
