package Operations;

public class pruebas {
	public static void main(String[] args) {
		Complex c1 = new Complex(3,5);
		Complex c2 = new Complex(2,-4);
		System.out.println(c1.setModule());
		System.out.println(c1.divComplex(c2).toString());
		System.out.println(c1.mulComplex(c2).toString());
	}

}
