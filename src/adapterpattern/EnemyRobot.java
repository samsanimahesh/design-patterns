package adapterpattern;

import java.util.Random;

public class EnemyRobot {
	Random generator = new Random();

	public void smashWithHands() {
		System.out.println("Enemy Robot causes damage of "
				+ generator.nextInt(20) + " with hands");
	}

	public void walkForward() {
		System.out.println("Enemy Robot walks " + generator.nextInt(5)
				+ " feet");
	}

	public void reactToHuman(String victim) {
		System.out.println("Enemy Robot kills "+victim);

	}
}
