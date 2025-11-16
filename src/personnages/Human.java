package personnages;

public class Human {
	private String name;
	private String favoriteDrink;
	private int money;
	protected Human[] memory = new Human[MAXIMUM_MEMORY];
	protected int nbMemory=0;
	
	static final int MAXIMUM_MEMORY=30;
	
	public Human(String name, String favoriteDrink, int money) {
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
	
	public void meet(Human otherHuman) {
		sayHello();
		otherHuman.sayHello();
		otherHuman.respond(this);
		memorize(otherHuman);
	}
	
	private void respond(Human otherHuman) {
		memorize(otherHuman);
	}
	
	private void memorize(Human otherHuman) {
		memory[nbMemory] = otherHuman;
		nbMemory++;
		nbMemory = nbMemory % MAXIMUM_MEMORY;
	}
	
	public void listMemory() {
		String result="";
		for (int i = 0; i < MAXIMUM_MEMORY; i++) {
			if (memory[i] != null) {
				result += memory[i].getName() + " ";
			}
		}
		speak("Je connais beaucoup de monde dont : "+result);
	}
}
