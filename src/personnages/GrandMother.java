package personnages;

import java.util.Random;

public class GrandMother extends Human{
	
	private enum HumanType {
		HUMAN("habitant"),
		COMMERCANT("commercant"),
		YAKUZA("yakuza"),
		RONIN("ronin"),
		SAMOURAI("samourai"),
		GRANDMOTHER("grandmother");
		private String type;
		
		private HumanType(String type){
			this.type = type;
		}
		
		public String getType() {
			return this.type;
		}
		
	}

	public GrandMother(String name, int money) {
		super(name, "tisane", money);
	}
	
	@Override
	protected void memorize(Human otherHuman) {
		if (nbMemory < 5) {
			memory[nbMemory] = otherHuman;
			nbMemory++;
		} else {
			speak("Oh ma tete ! Je ne peux plus retenir le nom d'une personne supplementaire !");
		}
	}
	
	private String randomHuman() {
		int pick = new Random().nextInt(HumanType.values().length);
		return HumanType.values()[pick].getType();
	}
	
	public void ragoter() {
		for (int i = 0; i < nbMemory; i++) {
			if (memory[i] instanceof Traitor) {
				speak("Je sais que "+memory[i].getName()+" est un traitre. Petit chenapan !");
			} else {
				speak("Je crois que "+memory[i].getName()+" est un "+randomHuman());
			}
		}
	}
}
