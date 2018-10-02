package no.axxessit.java.dump;

public class Light {
	
	public int noOfWatts;
	private boolean indicator;
	protected String location;
	
	private static int counter;
	
	Light() {
		noOfWatts = 50;
		indicator = true;
		location = "X";
		counter++;
	}
	
	public void switchOn(){
		indicator = true;
	}
	public void switchOff(){
		indicator=false;
	}
	
	public boolean isOn(){
		return indicator;
	}
	
	private void printLocation(){
		System.out.println("Location "+location);
	}
	
	public static void writeCount(){
		System.out.println("Number of Lights " +counter);
	}
	

}
