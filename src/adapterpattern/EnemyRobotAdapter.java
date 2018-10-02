package adapterpattern;

public class EnemyRobotAdapter implements EnemyAttacker{
	
	EnemyRobot theRobot;
	
	public EnemyRobotAdapter(EnemyRobot enemyRobot){
		theRobot = enemyRobot;
	}
	@Override
	public void fireWeapon() {
		theRobot.smashWithHands();
		
	}

	@Override
	public void driveForward() {
		theRobot.walkForward();
		
	}

	@Override
	public void assignDriver(String driverName) {
		theRobot.reactToHuman(driverName);
		
	}

}
