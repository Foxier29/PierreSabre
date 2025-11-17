package personnages;

public class Humain {
	static final int NBCONNAISSANCEMAX=3;
	private String nom;
	private int argent;
	private String boisson;
	protected int nbConnaissance;
	protected Humain[] memoire= new Humain[NBCONNAISSANCEMAX];
	
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
	protected void gagnerArgent(int gain)
	{
		argent+=gain;
	}
	protected void perdreArgent(int perte)
	{
		argent-=perte;
	}
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	private void memoriser(Humain humain)
	{
		if (nbConnaissance>=NBCONNAISSANCEMAX) {
			Humain[] nouveau_tab= new Humain[NBCONNAISSANCEMAX];
			for (int i=1;i<NBCONNAISSANCEMAX;i++)
			{
				nouveau_tab[i-1]=memoire[i];
			}
			nouveau_tab[NBCONNAISSANCEMAX-1]=humain;
			memoire=nouveau_tab;
		}
		else
		{
			memoire[nbConnaissance]=humain;
			nbConnaissance++;
		}
	}
	private void repondre(Humain humain)
	{
		direBonjour();
		memoriser(humain);
	}
	public void faireConnaissanceAvec(Humain autreHumain)
	{
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);	
	}
	public void listerConnaissance()
	{
		System.out.print("("+getNom()+")- Je connais beaucoup de monde dont : ");
		for (int i=0;i<nbConnaissance;i++)
		{
			System.out.print(memoire[i].getNom()+" ");
		}
		System.out.print("\n");
	}
}
