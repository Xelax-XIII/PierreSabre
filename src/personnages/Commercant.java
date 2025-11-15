package personnages;

public class Commercant extends Humain {
	public Commercant(String name, int money){
		super(name,"the",money);
	}
	
	public int beStolen() {
		int money = getMoney();
		looseMoney(money);
		speak("J'ai tout perdu! Le monde est trop injuste...");
		return money;
	}
	
	public void receive(int money) {
		gainMoney(money);
		speak(money + "sous ! Je te remercie genereux donateurs");
	}
}
