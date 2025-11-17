package personnages;

public class Ronin extends Humain{
	public Ronin(String nom, int argent, String boisson) {
		super(nom, argent, boisson);
	}

	private int honneur=1;
	public void donner(Commercant beneficiaire)
	{
		if (getArgent()>0) 
		{
			int argent = getArgent()/10 ;
			parler(beneficiaire.getNom()+" prend ces "+argent+" sous");
			beneficiaire.recevoir(argent);
			perdreArgent(argent);
		}
	}
	public void provoquer(yakuza adversaire)
	{
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fais à ce pauvre marchand!");
		int force=honneur*2;
		if (force>=adversaire.getReputation()) {
			parler("Je t'ai eu petit yakuza!");
			int gain=adversaire.perdre();
			gagnerArgent(gain);
			honneur+=1;}
		else {
			int perte=getArgent();
			perdreArgent(perte);
			honneur-=1;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			adversaire.gagner(perte);
			
				 
			
		}
	}
}
