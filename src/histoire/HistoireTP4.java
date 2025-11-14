package histoire;

import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "kombucha", 54);
		prof.sayHello();
		prof.buy("une boisson", 12);
		prof.drink();
		prof.buy("un jeu", 2);
		prof.buy("un kimono", 50);
		System.out.println("salut");
	}
}
