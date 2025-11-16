package histoire;

import personnages.Commercant;
import personnages.Human;
import personnages.Yakuza;
import personnages.Ronin;
import personnages.Samourai;
import personnages.Traitor;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", 20);
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		marco.meet(roro);
		marco.meet(yaku);
		marco.meet(chonin);
		marco.meet(kumi);
		marco.listMemory();
		roro.listMemory();
		yaku.listMemory();
		Samourai akimoto = new Samourai("Akimoto", "saké", 80, "Miyamoto");
		akimoto.meet(marco);
		akimoto.listMemory();
		Traitor masako = new Traitor("Masako", "whisky", 100, "Miyamoto");
//		masako.meet(marco);
//		masako.meet(chonin);
//		masako.meet(kumi);
//		masako.meet(yaku);
//		masako.meet(roro);
//		masako.meet(akimoto);
		masako.beNice();
		masako.ransom(kumi);
		masako.ransom(chonin);
		masako.ransom(marco);
		akimoto.meet(masako);
		masako.ransom(kumi);
		masako.meet(yaku);
		masako.beNice();
		masako.meet(roro);
		System.out.println("salut");
	}
}
