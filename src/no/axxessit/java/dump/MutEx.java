package no.axxessit.java.dump;

public class MutEx {
	public static void main(String[] args) {
		final StackImpl stack = new StackImpl(20);
		(new Thread("Pusher"){
			public void run(){
				for(int i=0;i<10;i++){
					System.out.println("Pushed " +stack.push(2008));
				}
			}
		}).start();
		
		(new Thread("Popper"){
			public void run(){
				for(int i=10;i<1;i--){
					System.out.println("Popped " +stack.pop());
				}
			}
		}).start();
		
	}

}
class StackImpl{
	private Object[] stackArray;
	private int topOfStack;
	StackImpl(int size){
		stackArray = new Object[size];
		topOfStack = -1;
	}
	public boolean push(Object element){
		if(topOfStack >= stackArray.length-1){
			return false;
		}
		++topOfStack;
		try{
			Thread.sleep(1000);
		}catch (Exception e) {
			System.out.println(e);
		}
		stackArray[topOfStack] = element;
		return true;
	}
	public Object pop(){
		if(topOfStack<0){
			return null;
		}
		Object obj = stackArray[topOfStack];
		stackArray[topOfStack] = null;
		try{
			Thread.sleep(1000);
		}catch (Exception e) {
			System.out.println(e);
		}
		topOfStack--;
		return obj;
	}
}
