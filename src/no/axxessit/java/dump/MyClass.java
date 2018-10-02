package no.axxessit.java.dump;

class Message{
	String hi = "Hello world";
}

class MySuperClass{
	Message msg = new Message();
}

public class MyClass extends MySuperClass{
	public static void main(String[] args) {
		
		MyClass obj = new MyClass();
		obj.print();
		
	}
	public void print(){
		System.out.println(msg.hi);
	}

}

