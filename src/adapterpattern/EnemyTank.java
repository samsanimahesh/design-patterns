package adapterpattern;

import java.util.Random;

public class EnemyTank implements EnemyAttacker{
	
	Random generator = new Random();

	@Override
	public void fireWeapon() {
		int attackDamage = generator.nextInt(10);
		System.out.println("Enemy Tank does "+attackDamage+ " damage");
		
	}

	@Override
	public void driveForward() {
		System.out.println("Enemy tank moves "+generator.nextInt(5)+" feet");
		
	}

	@Override
	public void assignDriver(String driverName) {
		System.out.println("Driver in the tank is " +driverName);
		
	}

}
