package week2.matrix;

public class Pixel {
	
	private int red;
	private int green;
	private int blue;
	private int rgb;
	
	public Pixel(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
		updateRGB();
	}
	
	public void updateRGB() {
		this.rgb = (red << 16) + (green << 8) + blue;
	}
	
	public int getRGB() {
		return this.rgb;
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}

	public void setRed(int red) {
		this.red = red;
		updateRGB();
	}

	public void setGreen(int green) {
		this.green = green;
		updateRGB();
	}

	public void setBlue(int blue) {
		this.blue = blue;
		updateRGB();
	}
	
	

}
