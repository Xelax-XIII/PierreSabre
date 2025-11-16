package personnages;

public class Yakuza extends Human {
	private int reputation=4;
	private String clan;
	
	public Yakuza(String name, String favoriteDrink, int money, String clan){
		super(name,favoriteDrink,money);
		this.clan = clan;	
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void stole(Commercant victim) {
		speak("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		speak(victim.getName()+", si tu tiens à la vie donne moi ta bourse !");
		reputation+=1;
		int stolenMoney = victim.beStolen();
		gainMoney(stolenMoney);
		speak("J’ai pique les "+stolenMoney+" sous de "+victim.getName()+", ce qui me fait "+getMoney()+" sous dans ma poche. Hi ! Hi !");
	}
	
	public int loose() {
		reputation-=1;
		int money = getMoney();
		looseMoney(money);
		speak("J’ai perdu mon duel et mes "+money+" sous, snif... J'ai deshonore le clan de "+clan);
		return money;
	}
	
	public void win(int gain) {
		reputation+=1;
		gainMoney(gain);
		speak("Ce ronin pensait vraiment battre "+getName()+" du clan de "+clan+" ? Je l'ai depouille de ses "+gain+" sous");
	}



	
}
