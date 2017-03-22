package wednesday.tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class HumanReadableMap {

//	Make a utility method that converts a hashMap into a very human-readable string###
	
	public static String returnMapAsString(Map<? extends Object,? extends Object> input){
		
		StringJoiner sj = new StringJoiner(", ","{","}");
		String pair;
		
		
		for(Object t:input.keySet()) {
			pair = t.toString() + ":"+ input.get(t).toString();
			sj.add(pair);
		}
		
		return sj.toString();
		
	}
	
	
	public static void main(String[] args) {
		Map<String, Integer> myMap = new HashMap<>();
		
		myMap.put("one", new Integer(1));
		myMap.put("two", 2);
		myMap.put("thre", 3);
		myMap.put("four", 4);
		
		System.out.println(returnMapAsString(myMap));
		
	}
	
}
