package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.yakuza;

public class HistoireTP4 {
	public static void main(String[] args)
	{
		Humain prof=new Humain("Prof",54,"kombucha");
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		Commercant marco=new Commercant("Marco",3929290);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		yakuza yaku=new yakuza("Yaku le Noir",30,"whisky","Warsong");
		yaku.direBonjour();
		yaku.extorquer(marco);
	}
}
