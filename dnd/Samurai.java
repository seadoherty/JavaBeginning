package dnd;

public class Samurai extends Human {

	static int numOfSamurai = 0;

	public Samurai() {
		super();
		numOfSamurai++;
	}

	void deathBlow(Human victim) {
		victim.health = 0;
		this.health /= 2;
	}

	void meditate() {
		this.health += (this.health / 2);
	}

	static int howMany() {
		return numOfSamurai;
	}

}
