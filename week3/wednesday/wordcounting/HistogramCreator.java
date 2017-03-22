package wednesday.wordcounting;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import wednesday.tasks.HumanReadableMap;

public class HistogramCreator {
	
	public static Map<String, Integer> getHistogram(String cryptedString) {
		
		//regex taken from stack overflow
		String processedInput = cryptedString.replaceAll("/^[a-zA-Z\\s]*$/", "");
		
		Map<String, Integer> histogram = new LinkedHashMap<>();
		
		String[] words = processedInput.split(" ");
		
		for(String s: words) {
			s.trim();
			if(histogram.containsKey(s)) {
				histogram.put(s, histogram.get(s) + 1);
			} else {
				histogram.put(s, 1);
			}
		
		}
		
//		System.out.println(HumanReadableMap.returnMapAsString(histogram));
		return histogram;
		
		
	}
	
	public static void main(String[] args) {
		
		Map<String, Integer> result = HistogramCreator.getHistogram("Ninjas are all over the place! We are all going to die!");
		System.out.println(HumanReadableMap.returnMapAsString(result));
		
	}
	
}