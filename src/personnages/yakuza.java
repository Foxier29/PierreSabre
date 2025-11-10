package personnages;

public class yakuza extends Humain{
	private String clan;
	public yakuza(String nom, int argent, String boisson , String clan) {
		super(nom, argent, boisson );
		this.clan=clan;}
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens ne serait-ce pas un faible marchand qui passe par là ?\n"+"("+getNom()+") "+victime.getNom()+" si tu tiens à la vie donne moi ta bourse !");
		int soussous=victime.seFaireExtorquer();
		this.gagnerArgent(soussous);
		parler("J'ai piqué les "+soussous+" de "+victime.getNom()+" ce qui me fait "+getArgent()+" dans ma poche. Hi ! Hi !");
		
	}
	

}
