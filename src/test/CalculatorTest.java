package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Operations.*;

public class CalculatorTest {
	@Test
	void testSuma() {

		// TestCase
		Complex c1 = new Complex(4, 3);
		Complex c2 = new Complex(3, -1);
		Complex c3 = c1.sumComplex(c2);
		 //System.out.println(c3);

		// Respuesta
		assertEquals("7.0 + 2.0i",c3.toString());
	}

	@Test
	void testResta() {

		// TestCase
		Complex c1 = new Complex(4, 3);
		Complex c2 = new Complex(3, -1);
		Complex c3 = c1.resComplex(c2);
		// System.out.println(c3);

		// Respuesta
		assertEquals("1.0 + 4.0i",c3.toString());

	}

	@Test
	void testProducto() {

		// TestCase
		Complex c1 = new Complex(4, 3);
		Complex c2 = new Complex(3, -1);
		Complex c3 = c1.mulComplex(c2);
		//System.out.println(c3);

		// Respuesta
		assertEquals("15.0 + 5.0i",c3.toString());
	}

	@Test
	void testDivision() {

		// TestCase
		Complex c1 = new Complex(4, 3);
		Complex c2 = new Complex(3, -1);
		Complex c3 = c1.divComplex(c2);
//		System.out.println(c3);

		// Respuesta 
		assertEquals("0.9 + 1.3i",c3.toString());

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
		assertEquals("4.0 + -3.0i",c3.toString());
	}



	@Test
	void testPolarToCartesian() {

		// TestCase
		Complex c1 = new Complex(0,0);
		Complex c2 = c1.setPolartoCartesian(5.0, 36.86989764584402);
		//System.out.println(c2);

		// Respuesta 
		assertEquals("4.0 + 3.0i",c2.toString());

	}

	@Test
	void testCartesianToPolar() {

		// TestCase
		Complex c1 = new Complex(4, 3);
		Complex c2 = new Complex(0, 0);
		Complex c3 = c2.setCartesiantoPolar(c1);
		//System.out.println(c3);

		// Respuesta 
		assertEquals("5.0 + 36.86989764584402i",c3.toString());

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
