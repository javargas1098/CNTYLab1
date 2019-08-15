package test;

import java.util.Arrays;

import operations.Complex;

public class pruebas {
	public static void main(String[] args) {
		Complex c1 = new Complex(4,5);
		Complex c2 = new Complex(2,-4);
		Complex c3 = new Complex(0, 0);
		Complex c4 = new Complex(4, 3);
		//System.out.println(c4.setModule());
		//System.out.println(c3.setPolartoCartesian(6.4, 51).toString());
		System.out.println(c3.setCartesiantoPolar(c1).toString());
		//System.out.println(c1.divComplex(c2).toString());
		//System.out.println(c1.mulComplex(c2).toString());
	}

}
