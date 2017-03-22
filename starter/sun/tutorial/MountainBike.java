package sun.tutorial;

public class MountainBike extends Bicycle {

	public int seatHeight; 
	
	public MountainBike(int startCadence, int startGear, int startSpeed, int seatHeight) {
		super(startCadence, startGear, startSpeed);
		this.seatHeight = seatHeight;
	}
	
	public void setSeat(int height) {
		this.seatHeight = height;
	}
	
	

}
