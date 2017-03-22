package week2.matrix;

public class GrayScaleConvertor implements MatrixOperation{
	
	public Pixel withPixel(int x, int y, Pixel[][] matrix) {
		Pixel p = matrix[x][y];
		int newGray = (int) ((p.getRed() * 0.2126 + p.getGreen() * 0.7152 + p.getBlue()*0.0722) / 3);
		p.setRed(newGray);
		p.setGreen(newGray);
		p.setBlue(newGray);
		return p;
	}
	

}


