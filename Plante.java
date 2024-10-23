package ds2023;

public class Plante {
	protected String nom;
	protected int hauteur;
	protected int age;
	protected double prix;
	
	
	public Plante(String nom, int hauteur, int age, double prix) {
		super();
		this.nom = nom;
		this.hauteur = hauteur;
		this.age = age;
		this.prix = prix;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getHauteur() {
		return hauteur;
	}
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String toString() {
		return getClass().getSimpleName()+": Nom:"+ nom + " et d'hauteur:" + hauteur + "et d'age:" + age + " et de prix:" + prix+"dinars" ;
	}
	
	public void description()
	{
		System.out.println(this);
	}

	
	

}
