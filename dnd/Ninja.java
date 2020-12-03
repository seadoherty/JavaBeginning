package dnd;

public class Ninja extends Human{

	public Ninja() {
		super();
		stealth=10;
	}
	
	void steal(Human stealee) {
		stealee.health -= this.stealth;
		this.health += this.stealth;
	}
	
	void runAway() {
		this.health -= 10;
	}

}
