package no.axxessit.java.dump;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DirectoryLister {

	public static void main(String[] args) {
		String path = null;
		if(args.length == 0){
			System.err.println("Please specify a directory name");
			Scanner s = new Scanner(System.in);
			path = s.next();
		}
		File entry = new File(path);
		listDirectory(entry);

	}

	private static void listDirectory(File entry) {
		try{
			if(!entry.exists()){
				System.out.println(entry.getName() + "not found");
				return;
			}
			if(entry.isFile()){
				System.out.println(entry.getCanonicalPath());
			}else if(entry.isDirectory()){
				String[] entryNames = entry.list();
				for(String entryName : entryNames){
					File thisEntry = new File(entry.getPath(),entryName);
					listDirectory(thisEntry);
				}
			}
		}catch(IOException e){
			System.out.println(e);
		}
		
		
	}

}
