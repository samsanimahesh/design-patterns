package no.axxessit.java.dump;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Directory or file name");
		analyzePath(input.nextLine());
	}

	private static void analyzePath(String nextLine) {
		File name = new File(nextLine);
		if(name.exists()){
			System.out.println(name.getName()+ "Exists");
			System.out.println(name.getAbsolutePath());
			try {
				System.out.println(name.getCanonicalPath());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(name.isFile()? " is a File":"Not a file");
			System.out.print(name.isDirectory()?"is a Directory":"is not a directory");
			if(name.isDirectory()){
				String[] directory = name.list();
				for(String directoryName : directory){
					System.out.println(directoryName);
				}
			}
			
		}else{
			System.out.println(nextLine + " does not exists");
		}
		
		
	}

}
