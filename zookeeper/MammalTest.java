package zookeeper;

public class MammalTest {

	public static void main(String[] args) {
		Gorilla gorg = new Gorilla();
		gorg.throwSomething();
		gorg.throwSomething();
		gorg.throwSomething();
		gorg.eatBananas();
		gorg.eatBananas();
		gorg.climb();
		int gorgEnergy = gorg.getEnergy();
		System.out.println(gorgEnergy);

		Bat batty = new Bat();
		batty.fly();
		batty.fly();
		batty.eatHumans();
		batty.eatHumans();
		batty.attackTown();
		batty.attackTown();
		batty.attackTown();
		int battyEnergy = batty.getEnergy();
		System.out.println(battyEnergy);
	}
}
