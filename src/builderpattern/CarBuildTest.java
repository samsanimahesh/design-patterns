package builderpattern;

import java.util.Scanner;

public class CarBuildTest {
	public static void main(String[] args) {
		
		CarBuilder genericCarBuilder = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select A car of your Choice (sedan/sportscar)");
		String choice = scanner.nextLine();
		if(choice.equals("sedan")){
		genericCarBuilder = new Sedan();
		}else if(choice.equals("sportscar")){
			genericCarBuilder = new SportsCar();
		}
		
		CarEngineer carEngineer = new CarEngineer(genericCarBuilder);
		carEngineer.makeCar();
		CarImpl sedanCar = carEngineer.getCar();
		System.out.println(sedanCar.getEngine());
		System.out.println(sedanCar.getTyre());
		System.out.println(sedanCar.getBody());
	}

}
