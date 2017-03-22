package wednesday.tasks;

import java.util.ArrayList;

public class OnOffCollection<T> {
	
	private ArrayList<T> container = new ArrayList<>();
	
	public void add(T element) {
		if(container.contains(element)){
			container.remove(element);
		} else {
			container.add(element);
		}
	}
	
	public T remove(int index) {
		T result = container.get(index);
		container.remove(index);
		return result;
	}
	

}
