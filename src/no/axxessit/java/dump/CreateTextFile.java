package no.axxessit.java.dump;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
	private Formatter outPut;
	public void openFile(){
		try {
			outPut = new Formatter("Clients.txt");
		}catch(SecurityException e){
			e.printStackTrace();
			System.exit(1);
		}
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	public void addRecords(){
		AccountRecord record = new AccountRecord();
		Scanner input = new Scanner(System.in);
		System.out.println("To Terminate the input press ctrl+z then press Enter");
		System.out.println("Enter Account Number(>0) ? ");
		System.out.println("Enter name");
		System.out.println("Enter balance");
		while(input.hasNext()){
			try{
				record.setAccount(input.nextInt());
				record.setName(input.next());
				record.setBalance(input.nextDouble());
				if(record.getAccount()>0){
					outPut.format("%d %s %.2f\n", record.getAccount(),record.getName(),record.getBalance());
				}else{
					System.out.println("Account Number does not exist");
				}
			}catch(FormatterClosedException e){
				e.printStackTrace();
			}catch (NoSuchElementException e) {
				System.err.println("Invalid input. please try again");
				input.nextLine();
			}
			
		}
	}
	public void closeFile(){
		if(outPut != null){
			outPut.close();
		}
	}

}
