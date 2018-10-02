package no.axxessit.java.dump;

public class Client {
	public static void main(String[] args) {
		Counter counterA = new Counter();
		System.out.println("Creating counter object ");
		(new Thread(counterA, "CounterA")).start();
//		thread.start();
		try{
			int val;
			do{
				val = counterA.getValue();
				System.out.println(Thread.currentThread().getName() + ":" +val);
				Thread.sleep(1000);
			}while(val<5);
		}catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}
class Counter implements Runnable{
	private int currentValue;
	public Counter(){
		currentValue = 0;
	}
	public int getValue(){
		return currentValue;
	}

	@Override
	public void run() {
		try{
			while(currentValue<5){
				System.out.println(Thread.currentThread().getName() + ":" +currentValue++);
				Thread.sleep(250);
			}
		}catch (InterruptedException e) {
			System.out.println(e);
		}
		
	}
	
}
