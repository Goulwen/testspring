package testspring;

import java.util.List;

import testspring.enregistreur.EnregistreurVetement;

public class GestionStock {

	private EnregistreurVetement enregistreur;

	public void inventaire() {
		List < Vetement > listeContenu = enregistreur.listeContenu();
		int count = 1;
		for (Vetement vetement : listeContenu) {
			System.out.println("" + count + " - " + vetement.getNom());
			count++;
		}
	}

	public void setEnregistreur(EnregistreurVetement enregistreur) {
		this.enregistreur = enregistreur;
	}
}
