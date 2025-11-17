package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.yakuza;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commercant marco=new Commercant("Marco",20);
		Commercant chonin=new Commercant("Chonin",40);
		Commercant kumi=new Commercant("Kumi",10);
		yakuza yaku=new yakuza("Yaku Le Noir",30,"whisky","Warsong");
		Ronin roro=new Ronin("Roro",60,"shochu");
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		
		
	}
}
