package no.axxessit.java.dump;

import java.util.Arrays;
import java.util.List;

public class Algorithm {
	public static void main(String[] args) {
		Character[] letters = {'P','C','M'};
		List<Character> list =  Arrays.asList(letters);
		for(Character ch : list){
			System.out.println(ch);
		}
		
	}
}
