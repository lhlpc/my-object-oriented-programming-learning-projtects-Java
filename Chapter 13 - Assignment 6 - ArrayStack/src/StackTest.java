// *********************************************************
// StackTest.java
//
// A simple driver that exercises push, pop, isFull and isEmpty.
// Thanks to autoboxing, we can push integers onto a stack of Objects.
//
// *********************************************************
public class StackTest {
	public static void main(String[] args) {
		StackADT stack = new ArrayStack();
		// push some stuff on the stack
		for (int i = 0; i < 6; i++)
			stack.push(i * 2);
		// pop and print
		// should print 8 6 4 2 0
		while (!stack.isEmpty())
			System.out.print(stack.pop() + " ");
		System.out.println();
		// push a few more things
		for (int i = 1; i <= 6; i++)
			stack.push(i);
		// should print 5 4 3 2 1
		while (!stack.isEmpty())
			System.out.print(stack.pop() + " ");
		System.out.println();
	}
}