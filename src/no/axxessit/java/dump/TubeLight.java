package no.axxessit.java.dump;

public class TubeLight extends Light{
	
	private int tubeLength = 54;
	private int colorNo = 10;
	
	public int getTubeLength() {
		return tubeLength;
	}
	
	public void printInfo(){
		System.out.println("Tube Length " +getTubeLength());
		System.out.println("Color Number " +colorNo);
		System.out.println("Wattage " +noOfWatts);
		System.out.println("Location " +location);
		System.out.println("Indicator is " +isOn());
		writeCount();
	}

}
