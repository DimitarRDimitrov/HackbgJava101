package monday;

public class GenericBackpack<T> {
	
	private T container;

	public GenericBackpack(T container) {
		super();
		this.container = container;
	}

	public T getContainer() {
		return container;
	}

	public void setContainer(T container) {
		this.container = container;
	}
	
}
