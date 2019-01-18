package testspring.enregistreur;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import testspring.Vetement;

public class EnregisteurVetementAlphabetique implements EnregistreurVetement {

	private EnregistreurVetement enregistreurVetement;

	public EnregisteurVetementAlphabetique(EnregistreurVetement enregistreurVetement) {
		this.enregistreurVetement = enregistreurVetement;
	}

	@Override
	public List < Vetement > listeContenu() {
		List < Vetement > listeContenu = enregistreurVetement.listeContenu();
		Collections.sort(listeContenu, new Comparator < Vetement >() {

			@Override
			public int compare(Vetement o1, Vetement o2) {
				return o1.getNom().compareTo(o2.getNom());
			}
		});
		return listeContenu;
	}

}
