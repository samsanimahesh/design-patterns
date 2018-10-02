package adapterpattern;

public class TestEnemyAdapter {
	
	public static void main(String[] args) {
		EnemyTank rxTank = new EnemyTank();
		EnemyRobot robot = new EnemyRobot();
		
		EnemyRobotAdapter adapter = new EnemyRobotAdapter(robot);
		System.out.println("The Robot");
		robot.reactToHuman("mahesh");
		robot.walkForward();
		robot.smashWithHands();
		System.out.println("Enemy Robot+Adapter");
		adapter.assignDriver("mahesh");
		adapter.driveForward();
		adapter.fireWeapon();
	}

}
