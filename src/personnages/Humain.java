package personnages;

public class Humain {
	private String nom;
	private int argent;
	private String boisson;
	
	public Humain(String nom, int argent, String boisson) {
		super();
		this.nom = nom;
		this.argent = argent;
		this.boisson = boisson;
	}
	protected void parler(String texte)
	{
		System.out.println("("+getNom()+") "+texte);
	}
	public void direBonjour()
	{
		parler("Bonjour ! je m'appelle " + nom + " j'aime boire du " + boisson);
	}
	public void boire()
	{
		parler("Mmmm, un bon verre de "+boisson+" ! GLOUPS !");
	}
	public void acheter(String bien,int prix)
	{
		if (argent>prix)
		{parler("j'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" � "+prix+" sous");
		perdreArgent(prix);}
		
		else 
		{parler("je n'ai plus que "+argent+" sous en poche. Je ne peux m�me pas m'offrir "+bien+" � "+prix+" sous");}
	}
	public void gagnerArgent(int gain)
	{
		argent+=gain;
	}
	public void perdreArgent(int perte)
	{
		argent-=perte;
	}
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	
}
