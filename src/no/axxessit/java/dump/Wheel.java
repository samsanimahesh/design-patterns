package no.axxessit.java.dump;

import java.io.Serializable;

public class Wheel implements Serializable{
	private int wheelSize;
	
	Wheel(int ws){
		wheelSize = ws;
	}
	public String toString(){
		return "Wheel Size : " +wheelSize;  
	}
	

}
