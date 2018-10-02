package no.axxessit.java.dump;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) {
		FileInputStream fromFile = null;
		FileOutputStream toFile = null;
		try{
			fromFile = new FileInputStream(args[0]);
			toFile = new FileOutputStream(args[1]);
		}catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}catch (Exception e) {
			System.out.println("ArrayIndexOutOfBounds");
		}
		try{
			while(true){
				int i = fromFile.read();
				if(i==-1){
					break;
				}
				toFile.write(i);
			}
		}catch (IOException e) {
			System.out.println("Error Writing");
		}
		try{
			fromFile.close();
			toFile.close();
		}catch (IOException e) {
			System.out.println("Error Closing File");
		}
	}

}
