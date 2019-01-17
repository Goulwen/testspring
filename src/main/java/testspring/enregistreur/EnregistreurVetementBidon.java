package testspring.enregistreur;

import java.util.ArrayList;
import java.util.List;

import testspring.Vetement;

public class EnregistreurVetementBidon implements EnregistreurVetement {

	@Override
	public List < Vetement > listeContenu() {
		List < Vetement > resultat = new ArrayList <>();
		resultat.add(new Vetement("T-shirt 1"));
		resultat.add(new Vetement("Robe 2"));
		resultat.add(new Vetement("Casquette 3"));
		return resultat;
	}

}
