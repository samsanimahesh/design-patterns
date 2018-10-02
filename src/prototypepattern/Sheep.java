package prototypepattern;

public class Sheep implements Animal{
	
	public Sheep(){
		System.out.println("Sheep object is created");
	}

	@Override
	public Animal makeClone() {
		Animal clonedObject = null;
		try {
			clonedObject = (Sheep)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clonedObject;
	}
	
	public String toString(){
		return "This is a sheep object";
	}

}
