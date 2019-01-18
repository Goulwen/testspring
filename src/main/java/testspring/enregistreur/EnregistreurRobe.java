package testspring.enregistreur;

import java.util.ArrayList;
import java.util.List;

import testspring.Vetement;

public class EnregistreurRobe implements EnregistreurVetement {

	private Integer nombreRobe;

	@Override
	public List < Vetement > listeContenu() {
		List < Vetement > resultat = new ArrayList < Vetement >();
		for (int i = 0; i < nombreRobe; i++) {
			resultat.add(new Vetement("Robe aléatoire " + i));
		}
		return resultat;
	}

	public void setNombreRobe(Integer nombreRobe) {
		this.nombreRobe = nombreRobe;
	}

}
