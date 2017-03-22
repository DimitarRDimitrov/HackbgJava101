package sun.tutorial;

public class Main {
	
	static Bicycle makeABike(Bicycle asd) {
		return new Bicycle(0, 0, 0);
	}

	public static void main(String[] args) {

		makeABike(new MountainBikeV2(1, 2, 3, 4));
		
	}

}
