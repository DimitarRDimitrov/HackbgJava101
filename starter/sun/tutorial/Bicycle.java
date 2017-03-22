package sun.tutorial;

public class Bicycle {

	private int cadence;
	private int gear;
	private int speed;

	// constructor
	public Bicycle(int startCadence, int startGear, int startSpeed) {
		this.cadence = startCadence;
		this.gear = startGear;
		this.speed = startSpeed;

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getCadence() {
		return cadence;
	}

	public int getGear() {
		return gear;
	}

	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}

}
