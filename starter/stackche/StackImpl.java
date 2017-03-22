package stackche;

public class StackImpl implements Stack {

	protected class Node {

		private Object obj;
		private Node next;

		public Node(Object obj, Node next) {
			super();
			this.obj = obj;
			this.next = next;
		}

		public Object getObject() {
			return this.obj;
		}

	}

	Node top = null;

	@Override
	public boolean isEmpty() {
		return (top == null) ? true : false;
	}

	@Override
	public void push(Object obj) {
		Node newNode = new Node(obj, top);
		top = newNode;
	}

	@Override
	public Object pop() {
		if (top == null) {
			System.out.println("The stack is empty.");
			return null;
		} else {
			Node result = this.top;
			this.top = result.next;
			return result.getObject();
		}
	}

	@Override
	public int length() {
		if (top == null) {
			return 0;
		} else {
			int counter = 0;
			Node node = this.top;
			while (node != null) {
				counter++;
				node = node.next;
			}
			return counter;
		}
	}

	@Override
	public Object peek() {
		if (top instanceof Node) {
			return top.getObject();
		}
		return null;
	}

}
