package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import operations.*;

public class CalculatorTest {
	@Test
	void testSuma() {

		// TestCase
		Complex c1 = new Complex(4, 3);
		Complex c2 = new Complex(3, -1);
		Complex c3 = c1.sumComplex(c2);
		// System.out.println(c3);

		// Respuesta
		assertEquals(7, c3.getReal());
		assertEquals(2, c3.getImaginario());
	}

	@Test
	void testResta() {

		// TestCase
		Complex c1 = new Complex(4, 3);
		Complex c2 = new Complex(3, -1);
		Complex c3 = c1.resComplex(c2);
		// System.out.println(c3);

		// Respuesta
		assertEquals(1, c3.getReal());
		assertEquals(4, c3.getImaginario());
	}

	@Test
	void testProducto() {

		// TestCase
		Complex c1 = new Complex(4, 3);
		Complex c2 = new Complex(3, -1);
		Complex c3 = c1.mulComplex(c2);
		//System.out.println(c3);

		// Respuesta
		assertEquals(15, c3.getReal());
		assertEquals(5, c3.getImaginario());
	}

	@Test
	void testDivision() {

		// TestCase
		Complex c1 = new Complex(4, 3);
		Complex c2 = new Complex(3, -1);
		Complex c3 = c1.divComplex(c2);
//		System.out.println(c3);

		// Respuesta 
		assertEquals(0.9, c3.getReal());
		assertEquals(1.3, c3.getImaginario());
	}

	@Test
	void testModulus() {

		// TestCase
		Complex c1 = new Complex(4, 3);
		double c2 = c1.setModule();;
//		System.out.println(c2);

		// Respuesta 
		assertEquals(5.0, c2);
	}

	@Test
	void testConjugate() {

		// TestCase
		Complex c1 = new Complex(4, 3);
		Complex c2 = new Complex(0, 0);
		Complex c3 = c2.conComplex(c1);
		//System.out.println(c3);

		// Respuesta 
		assertEquals(4, c3.getReal());
		assertEquals(-3, c3.getImaginario());
	}



	@Test
	void testPolarToCartesian() {

		// TestCase
		Complex c1 = new Complex(0,0);
		Complex c2 = c1.setPolartoCartesian(5.0, 36.86989764584402);
		//System.out.println(c2);

		// Respuesta 
		assertEquals(4, c2.getReal());
		assertEquals(3, c2.getImaginario());
	}

	@Test
	void testCartesianToPolar() {

		// TestCase
		Complex c1 = new Complex(4, 3);
		Complex c2 = new Complex(0, 0);
		Complex c3 = c2.setCartesiantoPolar(c1);
		//System.out.println(c3);

		// Respuesta 
		assertEquals(5.0, c3.getReal());
		assertEquals(36.86989764584402, c3.getImaginario());
	}
	@Test
	void testPhase() {

		// TestCase
		Complex c1 = new Complex(4, 3);
		double c2 = c1.setFase();
		//System.out.println(c2);

		// Respuesta 
		assertEquals(0.6435011087932844, c2);
	}

}
