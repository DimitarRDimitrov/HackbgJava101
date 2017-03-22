package week2;

public class Car {
	
	protected int mileage;
	
	public void drive(int kilometers) {
		setMileage(this.mileage + kilometers);
	}

	public boolean isCar() {
		return true;
	}
	
	public boolean isEcoFriendly(boolean testing) {
		return true;
	}



	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
}
