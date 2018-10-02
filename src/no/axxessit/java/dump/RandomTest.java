package no.axxessit.java.dump;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random rand = new Random(5);
		for(int i=0;i<3;i++){
		int j = rand.nextInt(5);
		System.out.println(j);
		}
	}

}
