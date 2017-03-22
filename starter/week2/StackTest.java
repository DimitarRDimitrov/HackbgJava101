package week2;

public class StackTest {

	public static void main(String[] args) {

			StackImpl myStack = new StackImpl(10);
			myStack.push(10);
			myStack.push(11);
			myStack.push(12);
			
			System.out.println(myStack.pop());
			System.out.println(myStack.pop());
			System.out.println(myStack.length());
			System.out.println(myStack.pop());
			System.out.println(myStack.pop());
			
			
		
	}

}
