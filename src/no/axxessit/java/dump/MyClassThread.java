package no.axxessit.java.dump;

public class MyClassThread extends Thread{
	public MyClassThread(String s){
		msg = s;
	}
	String msg;
	public void run(){
		System.out.println(msg);
	}
	public static void main(String[] args) {
		new MyClassThread("Hellop");
		new MyClassThread("Thread");
	}

}
