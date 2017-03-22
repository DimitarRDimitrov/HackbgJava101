package week2.matrix;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Matrix {
	
	private Pixel[][] matrice;
	String imgPath;
	File file;
	BufferedImage bi;
	
	public void operate(MatrixOperation op) {
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j < matrice[i].length; j++) {
				bi.setRGB(i, j,op.withPixel(i, j, matrice).getRGB());
			}
		}
	}
	
	public void returnModifiedImage() {
		try {
			ImageIO.write(bi, "png", new File("C:\\Users\\Dimitar\\input_modified.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public Matrix(String imgPath) throws IOException {
		this.imgPath = imgPath;
		this.file = new File(imgPath);
    	this.bi = ImageIO.read(file);
    	Color c;
    	
    	this.matrice = new Pixel[bi.getWidth()][bi.getHeight()];
    	
    	for (int i = 0; i < bi.getWidth(); i++) {
			for (int j = 0; j < bi.getHeight(); j++) {
				c = new Color(bi.getRGB(i, j));
				matrice[i][j] = new Pixel(c.getRed(), c.getGreen(), c.getBlue());
			}
    	}
	}

}
