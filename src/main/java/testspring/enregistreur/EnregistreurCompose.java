package testspring.enregistreur;

import java.util.ArrayList;
import java.util.List;

import testspring.Vetement;

public class EnregistreurCompose implements EnregistreurVetement {

	private EnregistreurVetement enregistreur1;
	private EnregistreurVetement enregistreur2;

	public EnregistreurCompose(EnregistreurVetement enregistreur1, EnregistreurVetement enregistreur2) {
		this.enregistreur1 = enregistreur1;
		this.enregistreur2 = enregistreur2;

	}

	@Override
	public List < Vetement > listeContenu() {
		List < Vetement > resultat = new ArrayList <>();
		resultat.addAll(enregistreur1.listeContenu());
		resultat.addAll(enregistreur2.listeContenu());
		return resultat;
	}

}
