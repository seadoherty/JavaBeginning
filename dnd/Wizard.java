package dnd;

public class Wizard extends Human {

	public Wizard() {
		super();
		health = 50;
		intelligence = 8;
	}

	void heal(Human healee) {
		healee.health += this.intelligence;
	}

	void fireball(Human burnee) {
		burnee.health -= this.intelligence * 3;
	}

}
