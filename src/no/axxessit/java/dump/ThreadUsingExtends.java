package no.axxessit.java.dump;

public class ThreadUsingExtends {
	public static void main(String[] args) {
		System.out.println("Method main() runs in thread " +Thread.currentThread().getName());
		CounterA counterA = new CounterA("CounterA");
		CounterA counterB = new CounterA("CounterB");
	}

}
class CounterA extends Thread{
	private int currentValue;
	public CounterA(String threadName){
		super(threadName);
		currentValue = 0;
//		setDaemon(true);
		System.out.println(this);
		start();
	}
	public int getValue(){
		return currentValue;
	}
	public void run(){
		try{
			while(currentValue<5){
				System.out.println(getName() + ":"+currentValue++);
				Thread.sleep(250);
			}
		}catch(InterruptedException e){
			System.out.println(e);
		}
	}
}
