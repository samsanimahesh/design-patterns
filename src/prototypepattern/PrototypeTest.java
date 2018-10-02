package prototypepattern;

public class PrototypeTest {
	public static void main(String[] args) {
		Sheep sheep = new Sheep();
		CloneFactory cloneFactory = new CloneFactory();
		Sheep clonedSheep = (Sheep)cloneFactory.getClone(sheep);
		
		System.out.println(sheep);
		System.out.println(clonedSheep);
		System.out.println("Sheep hashcode" +System.identityHashCode(System.identityHashCode(sheep)));
		System.out.println("Cloned Sheep hashcode" +System.identityHashCode(System.identityHashCode(clonedSheep)));
	}
	
}
