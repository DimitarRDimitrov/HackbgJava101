package wednesday.tasks;

import java.util.ArrayList;
import java.util.List;

public class RotateList {
	

	static <T> void rotate(List<T> collection, int rotateStep) {
		if(rotateStep == 0) {
			return;
		}
		int size = collection.size();
		T current;
		T temp;
		for (int i = 0; i < Math.abs(rotateStep); i++) {
			current = collection.get(0);
			for (int j = 0; j < collection.size(); j++) {
				if(rotateStep > 0) {
					temp = collection.get((j+1)%size);
					collection.set((j+1)%size, current);
					current = temp;
				} else if (rotateStep < 0) {
					temp = collection.get((size-j-1));
					collection.set((size-j-1), current);
					current = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
		l.add("one");
		l.add("two");
		l.add("three");
		l.add("four");
		l.add("five");
		l.add("six");
		l.add("seven");

		rotate(l,-1);
		System.out.println(l);
	}
}
