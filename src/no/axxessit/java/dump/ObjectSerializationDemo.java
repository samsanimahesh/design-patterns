package no.axxessit.java.dump;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectSerializationDemo {
	void writeData() {
		try {
			FileOutputStream outputFile = new FileOutputStream("FileStream.txt");
			ObjectOutputStream outputStream = new ObjectOutputStream(outputFile);
			String[] strArray = new String[] { "string1", "string2", "string3" };
			long num = 9900;
			int[] intArray = new int[] { 1, 2, 3 };
			String commonStr = strArray[2];
			outputStream.writeObject(strArray);
			outputStream.writeLong(num);
			outputStream.writeObject(intArray);
			outputStream.writeObject(commonStr);
			outputStream.flush();
			outputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	void readData() {
		try {
			FileInputStream inputFile = new FileInputStream("FileStream.txt");
			ObjectInputStream inputStream = new ObjectInputStream(inputFile);
			String[] strArray = (String[]) inputStream.readObject();
			long num = (long) inputStream.readLong();
			int[] intArray = (int[]) inputStream.readObject();
			String commonStr = (String) inputStream.readObject();
			System.out.println(Arrays.toString(strArray));
			System.out.println(Arrays.toString(intArray));
			System.out.println(commonStr);
			System.out.println(num);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ObjectSerializationDemo demo = new ObjectSerializationDemo();
		demo.writeData();
		demo.readData();
	}

}
