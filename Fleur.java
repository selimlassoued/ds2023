package ds2023;

public class Fleur extends Plante{
	private String couleur;
	private int moisF;
	
	
	
	public Fleur(String nom, int hauteur, int age, double prix,String couleur,int moisF) {
		super(nom, hauteur, age, prix);
		this.couleur=couleur;
		this.moisF=moisF;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getMoisF() {
		return moisF;
	}
	public void setMoisF(int moisF) {
		this.moisF = moisF;
	}
	
	public void fleurir()
	{
		if((this.moisF==4)||(this.moisF==5)||(this.moisF==6))
		{
			System.out.println("la fleur est en fleurs");
		}
		else
		{
			System.out.println("la fleur n'est pas en fleurs");
		}
	}
	public void description()
	{
		super.description();
		System.out.println(" couleur:"+this.couleur+" mois de florissant:"+this.moisF);
		this.fleurir();
	}
	
	
	
	
	
	
	
}
