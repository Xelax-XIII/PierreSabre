package personnages;

public class Ronin extends Humain {
	private int honor = 1;

	public Ronin(String name, String favoriteDrink, int money) {
		super(name, favoriteDrink, money);
	}

	public void give(Commercant dest) {
		int gift = getMoney() / 10;
		speak(dest.getName() + " prend ces " + gift + " sous");
		dest.receive(gift);
		looseMoney(gift);
	}

	public void provoke(Yakuza ennemy) {
		speak("Je t'ai retrouve vermine, tu vas payer pour ce que tu as fait a ce pauvre marchand !");
		if (honor >= ennemy.getReputation()) {
			speak("Je t’ai eu petit yakusa !");
			gainMoney(ennemy.loose());
			honor += 1;
		} else {
			speak("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			int money = getMoney();
			ennemy.win(money);
		}
	}
}
