package personnages;

import java.util.Random;

public class Traitor extends Samourai {
	private int treacheryLevel=0;
	
	public Traitor(String name, String favoriteDrink, int money, String lordName) {
		super(name, favoriteDrink, money, lordName);
	}
	
	@Override
	public void sayHello() {
		super.sayHello();
		speak("Mais je suis un traitre et mon niveau de traitrise est : "+treacheryLevel+". Chut !");
	}
	
	public void ransom(Commercant commercant) {
		if (treacheryLevel < 3) {
			int moneyRansomed = commercant.getMoney()*2/10;
			commercant.looseMoney(moneyRansomed);
			gainMoney(moneyRansomed);
			speak("Si tu veux ma protection contre les Yakuzas, uil va falloir payer ! Donne-moi "+moneyRansomed+" sous ou gare a toi !");
			commercant.speak("Tout de suite grand "+getName()+".");
			treacheryLevel++;
		} else {
			speak("Mince je ne peux plus rançonner personne inon un samourai risque de me demasquer !");
		}
	}
	
	public void beNice() {
		Random random = new Random();
		if (nbMemory < 1) {
			speak("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.");
		} else {
			int donation = getMoney() * 1/20;
			int indexHuman = random.nextInt(nbMemory);
			Human friend = memory[indexHuman];
			String friendName = friend.getName();
			speak("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec "+friendName+".");
			speak("Bonjour l'ami ! Je voudrais vous aider en vous donnant "+donation+" sous.");
			friend.gainMoney(donation);
			looseMoney(donation);
			String name = getName();
			speak("Merci "+name+". Vous etes quelqu'un de bien.");
			if (treacheryLevel > 1) {
				treacheryLevel--;
			}
		}
	}
}
