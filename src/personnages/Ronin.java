package personnages;

public class Ronin extends Humain {
	private int honor=1;
	
	public Ronin(String name, String favoriteDrink, int money){
		super(name,favoriteDrink,money);
	}
	
	public void give(Commercant dest) {
		int gift = getMoney()/10;
		speak(dest.getName()+" prend ces "+gift+" sous");
		dest.receive(gift);
		looseMoney(gift);
	}
}
