package no.axxessit.java.dump;

public class RQ200_150 {

	
	public static void main(String[] args) {
		for(Character cRef='A';cRef<'F';cRef++){
			switch(cRef){
			case 'B' : System.out.println(cRef);
						break;
			case 68: System.out.println(cRef);
					break;
					default:System.out.println((char)('a'+cRef - 'A'));
			}
		}

	}

}
