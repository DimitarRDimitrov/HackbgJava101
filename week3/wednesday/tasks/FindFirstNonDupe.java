package wednesday.tasks;

import java.io.ObjectInputStream.GetField;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class FindFirstNonDupe {
//	Make a utility method, which returns the first unique element in a given argument of type Collection<T>. Example:
//
//		Collection<T> ints = Arrays.asList(1,2,3,4,5,5,4,3,1);
//		System.out.println(yourMethod(ints)) //2;
	// THE ITERATOR DOES NOT RETURN CONSISTENT ORDER.. IT WILL FOR SOME OF THE COLLECTIONs

	
	static public <T> T getFirstNonDupe(Collection<T> ints) {

		HashMap<T, Integer> histogram = new HashMap<>();
		

		for (Iterator<T> iterator = ints.iterator(); iterator.hasNext();) {
			T t = (T) iterator.next();
			
			if(histogram.containsKey(t)) {
				histogram.put(t, 2);
			} else {
				histogram.put(t, 1);
			}
		}
		
		
		for(Iterator<T> iterator = ints.iterator(); iterator.hasNext();) {
			T t = (T) iterator.next();
			if(histogram.get(t) == 1) {
				return t;
			}
		}
		return null;
	}
	
	public static <T> void main(String[] args) {
		Collection<T> ints =  (Collection<T>) Arrays.asList(1,2,3,4,5,5,4,3,1);
		System.out.println(getFirstNonDupe(ints));
	}
	
	

}
