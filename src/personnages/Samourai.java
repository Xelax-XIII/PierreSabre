package personnages;

public class Samourai extends Ronin{
	private String lordName;
	
	public Samourai(String name, String favoriteDrink, int money, String lordName) {
		super(name, favoriteDrink, money);
		this.lordName = lordName;
	}
	
	public void drink(String drink) {
		speak("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du "+drink+".");
	}
	
	@Override
	public void sayHello() {
		super.sayHello();
		speak("Je suis fier de servir le seigneur "+lordName);
	}
}
