package personnages;

public class Humain {
	private String name;
	private String favoriteDrink;
	private int money;
	
	public Humain(String name, String favoriteDrink, int money) {
		this.name = name;
		this.favoriteDrink = favoriteDrink;
		this.money = money;
	}
	
	public String getName() {
		return name;
	}
	public int getMoney() {
		return money;
	}
	
	public void sayHello() {
		speak("Bonjour ! Je m'appelle "+name+" et j'aime boire du "+favoriteDrink);
	}
	
	public void drink() {
		speak("Mmmm, un bon verre de "+favoriteDrink+" ! GLOUPS !");
	}
	
	protected boolean gainMoney(int gain) {
		money += gain;
		return true;
	}
	
	protected boolean looseMoney(int loss) {
		if (money - loss < 0) {
			return false;
		} else {
			money -= loss;
			return true;
		}
	}
	
	public void buy(String item, int cost) {
		if (looseMoney(cost)) {
			speak("J'ai "+money+" sous en poche, je vais pouvoir m'offir "+item+" à "+cost);
		} else {
			speak("Je n'ai plus que "+money+" sous en poche, je ne vais pas pouvoir m'offir "+item+" à "+cost);
		}
	}
	
	protected void speak(String text) {
		System.out.println("("+name+") - "+text);
	}
}
