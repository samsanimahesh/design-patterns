package no.axxessit.java.dump;

import java.io.Serializable;

public class UniCycle implements Serializable {

	transient private Wheel wheel;

	UniCycle(Wheel wheel) {
		this.wheel = wheel;
	}

	public String toString() {
		return "UniCycle with " + wheel;
	}

}
