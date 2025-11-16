package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;
import personnages.Ronin;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.sayHello();
		prof.buy("une boisson", 12);
		prof.drink();
		prof.buy("un jeu", 2);
		prof.buy("un kimono", 50);
		Commercant marco = new Commercant("Marco", 20);
		marco.sayHello();
		marco.beStolen();
		marco.receive(15);
		marco.drink();
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yaku.sayHello();
		yaku.stole(marco);
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.sayHello();
		roro.give(marco);
		roro.provoke(yaku);
		System.out.println("salut");
	}
}
