package week2.matrix;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			
			Matrix m = new Matrix("C:\\Users\\Dimitar\\asd.jpg");
			MatrixOperation mo = new GrayScaleConvertor();
			m.operate(mo);
			m.returnModifiedImage();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
