package no.axxessit.java.dump;

public class AccountRecord {
	private int account;
	private String name;
	private double balance;
	public AccountRecord(){
		this(0,"",0);
	}
	public AccountRecord(int acc,String fname,double bal){
		setAccount(acc);
		setName(fname);
		setBalance(bal);
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
