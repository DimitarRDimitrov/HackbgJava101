package monday;

public class Triple<T> {
	
	private T container1;
	private T container2;
	private T container3;
	
	public Triple() {
	}
	public Triple(T container1, T container2, T container3) {
		this.container1 = container1;
		this.container2 = container2;
		this.container3 = container3;
	}
	public T getContainer1() {
		return container1;
	}
	public void setContainer1(T container1) {
		this.container1 = container1;
	}
	public T getContainer2() {
		return container2;
	}
	public void setContainer2(T container2) {
		this.container2 = container2;
	}
	public T getContainer3() {
		return container3;
	}
	public void setContainer3(T container3) {
		this.container3 = container3;
	}
	
	
	
	
	

}
