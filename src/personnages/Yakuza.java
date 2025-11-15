package personnages;

public class Yakuza extends Humain {
	private int reputation=0;
	private String clan;
	
	public Yakuza(String name, String favoriteDrink, int money, String clan){
		super(name,favoriteDrink,money);
		this.clan = clan;	
	}
	
	public void stole(Commercant victim) {
		speak("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		speak(victim.getName()+", si tu tiens à la vie donne moi ta bourse !");
		reputation+=1;
		int stolenMoney = victim.beStolen();
		gainMoney(stolenMoney);
		speak("J’ai pique les "+stolenMoney+" sous de "+victim.getName()+", ce qui me fait "+getMoney()+" sous dans ma poche. Hi ! Hi !");
	}
}
