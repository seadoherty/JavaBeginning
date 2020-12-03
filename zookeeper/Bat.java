package zookeeper;

public class Bat extends Mammal {

	public Bat() {
		super();
	}

	void fly() {
		System.out.println("Flap flap");
		energy -= 50;
	}

	void eatHumans() {
		energy += 25;
	}

	void attackTown() {
		System.out.println("Ahh it's burning!");
		energy += 100;
	}
}
