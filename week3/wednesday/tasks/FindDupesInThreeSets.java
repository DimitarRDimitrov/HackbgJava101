package wednesday.tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDupesInThreeSets {
	
	public static <T> Set<T> returnSetOfDupes(Set<T> a, Set<T> b, Set<T> c) {
		Set<T> dupes = new HashSet<>();
		Map<T,Integer> histogram = new HashMap<>();
		
		
		for(T t: a) {
			histogram.put(t, 1);
		}
		
		for (T t: b) {
			if(histogram.containsKey(t)){
				histogram.put(t, histogram.get(t) + 1);
			}
		}
		
		for (T t: c) {
			if(histogram.containsKey(t)){
				histogram.put(t, histogram.get(t) + 1);
			}
		}
		
		for(T t:histogram.keySet()) {
			if(histogram.get(t) == 3){
				dupes.add(t);
			}
		}
		
		return dupes;
	}
	
	public static void main(String[] args) {
		Set<Integer> A = new HashSet<>(Arrays.asList(1,2,3,4,5));
		Set<Integer> B = new HashSet<>(Arrays.asList(4,5,6));
		Set<Integer> C = new HashSet<>(Arrays.asList(5,6,7,8));
		
		System.out.println(returnSetOfDupes(A, B, C));
		
	}
	
	

}
