package no.axxessit.java.dump;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<Number> stack = new Stack<Number>();
		stack.push(12);
		stack.push(13);
		stack.push(14);
		if (!stack.isEmpty()) {
			System.out.println(stack);
		}
	}

}
