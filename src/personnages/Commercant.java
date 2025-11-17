package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom, argent, "the");}
	
	
	public int seFaireExtorquer()
	{
		parler("J'ai tout perdu ! le monde est vraiment injuste...");
		int perte=this.getArgent();
		perdreArgent(perte);
		return perte;
		
	}
	public void recevoir(int argent)
	{
		gagnerArgent(argent);
		parler(argent+" sous ! Je te remercie genereux donateur!");
		
	}
}
