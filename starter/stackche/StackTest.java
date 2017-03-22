package stackche;

public class StackTest {

	public static void main(String[] args) {

		StackImpl myStack = new StackImpl();
		Object obj1 = new Object();
		Object obj2 = new Object();
		Object obj3 = new Object();

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println();
		myStack.push(obj1);
		System.out.println(myStack.length());
		System.out.println(myStack.peek());
		myStack.push(obj2);
		System.out.println(myStack.length());
		System.out.println(myStack.peek());
		myStack.push(obj3);
		System.out.println(myStack.length());
		System.out.println(myStack.peek());
		System.out.println(myStack.pop());
		System.out.println(myStack.peek());
		myStack.pop();
		System.out.println(myStack.peek());
		myStack.pop();
		System.out.println(myStack.length());

	}

}
