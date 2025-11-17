package personnages;

public class yakuza extends Humain{
	private String clan;
	private int reputation=4;
	public yakuza(String nom, int argent, String boisson , String clan) {
		super(nom, argent, boisson );
		this.clan=clan;}
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens ne serait-ce pas un faible marchand qui passe par là ?\n"+"("+getNom()+") "+victime.getNom()+" si tu tiens à la vie donne moi ta bourse !");
		int soussous=victime.seFaireExtorquer();
		this.gagnerArgent(soussous);
		parler("J'ai pique les "+soussous+" de "+victime.getNom()+" ce qui me fait "+getArgent()+" dans ma poche. Hi ! Hi !");
		
	}
	public int getReputation() {
		return reputation;
	}
	public int perdre() {
		int perte=getArgent();
		parler("J'ai perdu mon duel et mes "+perte+" sous, snif... J'ai déshonoré le clan de "+clan);
		perdreArgent(perte);
		if (reputation>0) {reputation-=1;}
		return perte;
	}
	public void gagner(int argent) {
		parler("Ce ronin pensait vraiment battre "+getNom()+" du clan de "+clan+" ? \n Je l'ai dépouillé de ses "+argent+" sous");
		gagnerArgent(argent);
		reputation+=1;
	}
	public void direBonjour()
	{
		super.direBonjour();
		parler("Mon clan est celui de "+clan+".");
	}
	

}
