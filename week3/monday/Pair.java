package monday;

public class Pair<T,V> { //my pair can contain 2 types
	
	private T container1;
	private V container2;
	
	public Pair(T container1, V container2) {
		this();
		this.container1 = container1;
		this.container2 = container2;
	}
	
	public Pair(){
		
	}

	public T getContainer1() {
		return container1;
	}

	public void setContainer1(T container1) {
		this.container1 = container1;
	}

	public V getContainer2() {
		return container2;
	}

	public void setContainer2(V container2) {
		this.container2 = container2;
	}
	

}
