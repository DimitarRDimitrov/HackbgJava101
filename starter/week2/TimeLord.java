package week2;

public class TimeLord {
	
	private int hours;
	private int minutes;
	private int seconds;
	private int day;
	private int month;
	private int year;
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public TimeLord(int day, int month, int year, int second, int minute, int hour) {
		setDay(day);
		setMonth(month);
		setYear(year);
		setSeconds(second);
		setMinutes(minute);
		setHours(hour);
	}
	
	public String toString() {
		return String.format("%02d:%02d:%02d %02d.%02d.%d", getHours(), getMinutes(), getSeconds(), getDay(), getMonth(), getYear());
	}
	
	public static void main(String[] args) {
		TimeLord tl = new TimeLord(28, 1, 1993, 15, 44, 5);
		System.out.println(tl);
		
	}
	

}
