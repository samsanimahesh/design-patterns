package no.axxessit.java.dump;

public class MyThreadDemo extends Thread{
	static Object lock1 = new Object();
	static Object lock2 = new Object();
	static Object lock3 = new Object();
	static volatile int i1,i2,j1,j2,k1,k2;
	public void run(){
		while(true){
			doIt();
			check();
		}
	}
	void doIt(){
		synchronized (lock1) {
			i1++;
		}
		j1++;
		synchronized (lock2) {
			k1++;
			k2++;
		}
		j2++;	
		synchronized (lock3) {
			i2++;
		}
	}
	void check(){
		if(i1 != i2){
			System.out.println("i");
		}
		if(j1 != j2){
			System.out.println("j");
		}
		if(k1 != k2){
			System.out.println("k");
		}
	}
	public static void main(String[] args) {
		new MyThreadDemo().start();
		new MyThreadDemo().start();
	}

}
