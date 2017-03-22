package stackche;

public class StackV2 implements Stack {

	private Node header;
	private int size;

	private class Node {

		private Object container;
		private Node prev;
		private Node next;

		public Node(Object data) {
			this.container = data;
		}

		public Node getPrev() {
			return prev;
		}

		public void setPrev(Node prev) {
			this.prev = prev;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Object getContainer() {
			return container;
		}

	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void push(Object obj) {
		Node temp = new Node(obj);
		if (isEmpty()) {
			header = temp;
			size++;
		} else {
			header.setPrev(temp);
			temp.setNext(header);
			header.setNext(temp);
			size++;
		}
	}

	@Override
	public Object pop() {
		Node temp = header;
		if(isEmpty()) {
			return null;
		} else if (size == 1) {
			header = null;
			size--;
		} else {
			header = header.getNext();
			header.setPrev(null);	
			size--;
		}
		return temp;
	}

	@Override
	public int length() {
		return size;
	}

	@Override
	public Object peek() {
		if (isEmpty()) {
			return null;
		}
		return header;
	}
	
	public String toString() {
		if(isEmpty()) {
			return "The stack is empty!";
		}
		Node current = header;
		String result = new String(header.getContainer().toString());
		while(current.getNext() != null) {
			current = current.getNext();
			result += " " + header.getContainer().toString();
		}
		return result;
	}
	
	public StackV2() {
		
	}
	
	public static Stack createStackV2() { //anonymous O_O
		Stack st = new Stack() {
			
			private Node header;
			private int size;

			class Node {

				private Object container;
				private Node prev;
				private Node next;

				public Node(Object data) {
					this.container = data;
				}

				public Node getPrev() {
					return prev;
				}

				public void setPrev(Node prev) {
					this.prev = prev;
				}

				public Node getNext() {
					return next;
				}

				public void setNext(Node next) {
					this.next = next;
				}

				public Object getContainer() {
					return container;
				}

			}

			@Override
			public boolean isEmpty() {
				return size == 0;
			}

			@Override
			public void push(Object obj) {
				Node temp = new Node(obj);
				if (isEmpty()) {
					header = temp;
					size++;
				} else {
					System.out.println(header.getContainer());
					header.setPrev(temp);
					temp.setNext(header);
					header = temp;
					size++;
				}
			}

			@Override
			public Object pop() {
				Node temp = header;
				if(isEmpty()) {
					return null;
				} else if (size == 1) {
					header = null;
					size--;
				} else {
					header = header.getNext();
					header.setPrev(null);	
					size--;
				}
				return temp;
			}

			@Override
			public int length() {
				return size;
			}

			@Override
			public Object peek() {
				if (isEmpty()) {
					return null;
				}
				return header;
			}
			
			public String toString() {
				if(isEmpty()) {
					return "The anonymous stack is empty!";
				}
				Node current = header;
				String result = new String(header.getContainer().toString());
				while(current.getNext() != null) {
					current = current.getNext();
					result += " " + current.getContainer().toString();
				}
				return result;
			}
			
		};
		return st;
	}

}
