package zookeeper;

public class Gorilla extends Mammal {

	public Gorilla() {
		super();
	}

	void throwSomething() {
		System.out.println("Heads up something just got tossed!");
		energy -= 5;
	}

	void eatBananas() {
		System.out.println("Nanners are yummy...");
		energy += 10;
	}

	void climb() {
		System.out.println("Look ma I'm in a tree!");
		energy -= 10;
	}

}
