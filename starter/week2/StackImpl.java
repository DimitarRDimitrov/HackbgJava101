package week2;

public class StackImpl implements Stack {

	private Integer[] myStack;
	private int size;
	private int counter;
	
//	private void swap(Integer a, Integer b) {
//		Integer temp = a;
//		a = b;
//		b = temp;
//	}
	
	public StackImpl() {
		this(10);
	}
	
	public StackImpl(int size) {
		this.size = size;
		myStack = new Integer[size];
		counter = 0;
	}
	
	private void moveAllLeft() {
		for (int i = counter; i >= 0; i--) {
			myStack[i+1] = myStack[i];
		}
		myStack[0] = null;
		
	}
	
	private void moveAllRight() {
		for (int i = 1; i <= counter; i++) {
			myStack[i-1] = myStack[i];
		}
	}
	
	@Override
	public void push(Integer i) {
		if(counter == myStack.length) {
			Integer[] myNewStack = new Integer[size*2];
			myStack = myNewStack;
			moveAllLeft();
			
			myStack[0] = i;
			counter++;
		} else {
			moveAllLeft();
			myStack[0] = i;
			counter++;
		}
	}

	@Override
	public Integer pop() {
		Integer element = myStack[0];
		if(element == null) {
			return null;
		}
		moveAllRight();
		counter--;
		return element;
	}

	@Override
	public int length() {
		return counter;
	}

	@Override
	public void clear() {
		myStack = new Integer[size];
	}

	@Override
	public boolean isEmpty() {
		return myStack[0] == null;
	}

}
