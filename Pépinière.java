package ds2023;

public class Pépinière {

	private final int MAX_PLANTES=1000;
	private Plante[] inventaire;
	private int nombreDePlante=0;
	private int nbmax;
	public Pépinière(int nbmax) {
		if((nbmax<=MAX_PLANTES)&&(nbmax>0))
		{
			inventaire=new Plante[nbmax];
			this.nbmax=nbmax;
		}
		else
		{
			System.out.println("il faut que la taille maximale du tableau soit entre 0 et 1000");
		}
	}
	public void ajoutPlante(Plante plante)
	{
		if(this.nbmax>this.nombreDePlante)
		{
			inventaire[this.nombreDePlante]=plante;
			this.nombreDePlante++;
		}
		else
		{
			System.out.println("l'ajout est impossible");
		}
	}
	public void afficherInventaire()
	{
		System.out.println("Inventaire de la pépinière:");
		for(int i=0;i<nombreDePlante;i++)
		{
			System.out.println("Plante #"+(i+1));
			this.inventaire[i].description();
		}
	}
	public int totalAbsorptionTotaleCO2()
	{
		int nb=0;
		for(int i=0;i<nombreDePlante;i++)
		{
			if(inventaire[i] instanceof Arbre)
			{
				nb=nb+((Arbre)inventaire[i]).double_absorption();
			}
		}
		return nb;
	}
	public int compterArbresCaduques()
	{
		int nb=0;
		for(int i=0;i<this.nombreDePlante;i++)
		{
			if(inventaire[i] instanceof Arbre)
			{
				if (((Arbre)inventaire[i]).getType_Feuillage().equals("Caduque"))
				{
					nb++;
				}
			}
		}
		return nb;
	}
}
	
