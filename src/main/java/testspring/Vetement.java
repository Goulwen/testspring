package testspring;

public class Vetement {

	private String nomFabriquant;
	private int taille;
	private String nom;

	public Vetement(String nom) {
		this.nom = nom;
	}

	public String getNomFabriquant() {
		return nomFabriquant;
	}

	public void setNomFabriquant(String nomFabriquant) {
		this.nomFabriquant = nomFabriquant;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
