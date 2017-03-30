package friday.myhashmap;

public class TestMyHashMap {

	public static void main(String[] args) {

		MyHashMap<String, Integer> mhm = new MyHashMap<>();
		
		char[] myChars = {'a', 'b', 'c', 'd','e','f','j','h','i','j','k','l','m','o','p','q','r','s'};
		for(int i=0; i < 17; i++) {
			mhm.put(String.valueOf(myChars[i]), i);
		}
		mhm.put("h", 333);
		
		System.out.println(mhm.getCapacity());
		System.out.println(mhm.get("h"));
		System.out.println(mhm.get("o"));
		
		
	}

}
