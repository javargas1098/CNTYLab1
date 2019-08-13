package Operations;

import java.util.Arrays;

public class pruebas {
	public static void main(String[] args) {
		Complex c1 = new Complex(4,5);
		Complex c2 = new Complex(2,-4);
		System.out.println(Arrays.toString(c1.setCartesian()));
		System.out.println(c1.divComplex(c2).toString());
		System.out.println(c1.mulComplex(c2).toString());
	}

}
