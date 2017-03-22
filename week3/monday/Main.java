package monday;

public class Main {

	public static void main(String[] args) {

		GenericSummation<Integer> gsi = new GenericSummation<>();
		gsi.setLeft(44);
		gsi.setRight(55);
		System.out.println(gsi.sum());
		
		GenericSummation<Double> gsd = new GenericSummation<>();
		gsd.setLeft(5.55);
		gsd.setRight(6.66);
		System.out.println(gsd.sum());
		
		String s1 = "str";
		String s2 = new String("str").intern();
		
		System.out.println(s1 == s2);
		
	}

}
