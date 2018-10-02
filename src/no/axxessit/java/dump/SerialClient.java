package no.axxessit.java.dump;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialClient {
	public static void main(String[] args) throws IOException,
			ClassNotFoundException {
		SerialClient demo = new SerialClient();
		demo.writeData();
		demo.readData();

	}

	void writeData() throws IOException {
		FileOutputStream outputFile = new FileOutputStream("Mahehs.txt");
		ObjectOutputStream outputStream = new ObjectOutputStream(outputFile);
		Wheel wheel = new Wheel(10);
		UniCycle uc = new UniCycle(wheel);
		System.out.println("Before Writing " + uc);
		outputStream.writeObject(uc);
		outputStream.flush();
		outputStream.close();
	}

	void readData() throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("Mahehs.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		UniCycle uc = (UniCycle) ois.readObject();
		System.out.println("After Reading " + uc);
		ois.close();
	}

}
