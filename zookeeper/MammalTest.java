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

		int energy = gorg.getEnergy();

		System.out.println(energy);
	}
}
