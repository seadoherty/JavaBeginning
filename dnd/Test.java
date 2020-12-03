package dnd;

public class Test {

	public static void main(String[] args) {
		Wizard wiz = new Wizard();
		Ninja nin = new Ninja();
		Samurai sam = new Samurai();
		Samurai sami = new Samurai();

		sam.attack(nin);
		wiz.attack(nin);
		sam.attack(wiz);

		wiz.heal(nin);
		wiz.fireball(sam);

		nin.steal(wiz);
		nin.runAway();

		sam.deathBlow(wiz);
		sam.meditate();

		int samuraiCount = Samurai.howMany();

		int wizHealth = wiz.getHealth();
		int ninHealth = nin.getHealth();
		int samHealth = sam.getHealth();

		System.out.println(wizHealth);
		System.out.println(ninHealth);
		System.out.println(samHealth);
		System.out.println(samuraiCount);
	}
}
