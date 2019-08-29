package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Operations.*;

public class MatrixTest {
	
	
	@Test
	void testMatSuma() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		MatrizComplex mat2 = new MatrizComplex(2, 2);
		
		MatrizComplex mat3 = new MatrizComplex(2, 2);
		//math1
		Complex c1 = new Complex(2,2);
		Complex c2 = new Complex(2,0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);
		//mat2
		Complex c7 = new Complex(3,0);
		Complex c8 = new Complex(1,4);
		Complex c9 = new Complex(2, 2);
		Complex c10 = new Complex(5, 0);
		//math answer
		Complex c5 = new Complex(5, 2);
		Complex c6 = new Complex(3, 4);	
		Complex c11 = new Complex(3, -2);
		Complex c12 = new Complex(5, 0);
		
		

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);
		
		mat2.addComplex(0, 0, c7);
		mat2.addComplex(0, 1, c8);
		mat2.addComplex(1, 0, c9);
		mat2.addComplex(1, 1, c10);
		
		
		mat3.addComplex(0, 0, c5);
		mat3.addComplex(0, 1, c6);
		mat3.addComplex(1, 0, c11);
		mat3.addComplex(1, 1, c12);
		
		MatrizComplex mathfinal = MatrixCalculator.sumMatrix(mat1, mat2);
		
		//System.out.println(mathfinal.toString());
		
		//Respuesta
		assertEquals(mat3,mathfinal);


	}
	@Test
	void testMatResta() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		MatrizComplex mat2 = new MatrizComplex(2, 2);
		
		MatrizComplex mat3 = new MatrizComplex(2, 2);
		//math1
		Complex c1 = new Complex(2,2);
		Complex c2 = new Complex(2,0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);
		//mat2
		Complex c7 = new Complex(3,0);
		Complex c8 = new Complex(1,4);
		Complex c9 = new Complex(2, 2);
		Complex c10 = new Complex(5, 0);
		//math answer
		Complex c5 = new Complex(-1, 2);
		Complex c6 = new Complex(1, -4);	
		Complex c11 = new Complex(-1, -6);
		Complex c12 = new Complex(-5, 0);
		
		

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);
		
		mat2.addComplex(0, 0, c7);
		mat2.addComplex(0, 1, c8);
		mat2.addComplex(1, 0, c9);
		mat2.addComplex(1, 1, c10);
		
		
		mat3.addComplex(0, 0, c5);
		mat3.addComplex(0, 1, c6);
		mat3.addComplex(1, 0, c11);
		mat3.addComplex(1, 1, c12);
		
		MatrizComplex mathfinal = MatrixCalculator.resMatrix(mat1, mat2);
		
		//System.out.println(mathfinal.toString());
		
		//Respuesta
		assertEquals(mat3,mathfinal);


	}
	@Test
	void testMatScalar() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		
		MatrizComplex mat3 = new MatrizComplex(2, 2);
		//math1
		Complex c1 = new Complex(2,2);
		Complex c2 = new Complex(2,0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);
		//scalar
		Complex c8 = new Complex(1,4);
		//math answer
		Complex c5 = new Complex(-6, 10);
		Complex c6 = new Complex(2, 8);	
		Complex c11 = new Complex(17, 0);
		Complex c12 = new Complex(0, 0);
		
		

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		
		mat3.addComplex(0, 0, c5);
		mat3.addComplex(0, 1, c6);
		mat3.addComplex(1, 0, c11);
		mat3.addComplex(1, 1, c12);
		
		MatrizComplex mathfinal = MatrixCalculator.scalarMatrix(c8, mat1);
		
		//System.out.println(mathfinal.toString());
		
		//Respuesta
		assertEquals(mat3,mathfinal);


	}
	@Test
	void testMatTraspuesta() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		
		MatrizComplex mat3 = new MatrizComplex(2, 2);
		//math1
		Complex c1 = new Complex(2,2);
		Complex c2 = new Complex(2,0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);

		//math answer
		Complex c5 = new Complex(2, 2);
		Complex c6 = new Complex(1, -4);	
		Complex c11 = new Complex(2, 0);
		Complex c12 = new Complex(0, 0);
		
		

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		
		mat3.addComplex(0, 0, c5);
		mat3.addComplex(0, 1, c6);
		mat3.addComplex(1, 0, c11);
		mat3.addComplex(1, 1, c12);
		
		MatrizComplex mathfinal = MatrixCalculator.trasMatrix( mat1);
		
		//System.out.println(mathfinal.toString());
		
		//Respuesta
		assertEquals(mat3,mathfinal);

	}
	@Test
	void testMatConju() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		
		MatrizComplex mat3 = new MatrizComplex(2, 2);
		//math1
		Complex c1 = new Complex(2,2);
		Complex c2 = new Complex(2,0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);

		//math answer
		Complex c5 = new Complex(2,-2);
		Complex c6 = new Complex(2, 0);	
		Complex c11 = new Complex(1, 4);
		Complex c12 = new Complex(0, 0);
		

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		
		mat3.addComplex(0, 0, c5);
		mat3.addComplex(0, 1, c6);
		mat3.addComplex(1, 0, c11);
		mat3.addComplex(1, 1, c12);
		
		MatrizComplex mathfinal = MatrixCalculator.conMatrix(mat1);
		
		//System.out.println(mathfinal.toString());
		//System.out.println(mat3.toString());
		
		//Respuesta
		assertEquals(mat3,mathfinal);

	}
	@Test
	void testMatAdj() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		
		MatrizComplex mat3 = new MatrizComplex(2, 2);
		//math1
		Complex c1 = new Complex(2,2);
		Complex c2 = new Complex(2,0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);

		//math answer
		Complex c5 = new Complex(2,-2);
		Complex c6 = new Complex(1, 4);	
		Complex c11 = new Complex(2, -0);
		Complex c12 = new Complex(0, -0);
		
		

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		
		mat3.addComplex(0, 0, c5);
		mat3.addComplex(0, 1, c6);
		mat3.addComplex(1, 0, c11);
		mat3.addComplex(1, 1, c12);
		
		MatrizComplex mathfinal = MatrixCalculator.adjMatrix(mat1);
		
		//System.out.println(mathfinal.toString());
		//System.out.println(mat3.toString());
		
		//Respuesta
		assertEquals(mat3,mathfinal);

	}
	@Test
	void testMatMul() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		MatrizComplex mat2 = new MatrizComplex(2, 2);
		
		MatrizComplex mat3 = new MatrizComplex(2, 2);
		//math1
		Complex c1 = new Complex(2,2);
		Complex c2 = new Complex(2,0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);
		//mat2
		Complex c7 = new Complex(3,0);
		Complex c8 = new Complex(1,4);
		Complex c9 = new Complex(2, 2);
		Complex c10 = new Complex(5, 0);
		//math answer
		Complex c5 = new Complex(10, 10);
		Complex c6 = new Complex(4, 10);	
		Complex c11 = new Complex(3, -12);
		Complex c12 = new Complex(17, 0);
		
		

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);
		
		mat2.addComplex(0, 0, c7);
		mat2.addComplex(0, 1, c8);
		mat2.addComplex(1, 0, c9);
		mat2.addComplex(1, 1, c10);
		
		
		mat3.addComplex(0, 0, c5);
		mat3.addComplex(0, 1, c6);
		mat3.addComplex(1, 0, c11);
		mat3.addComplex(1, 1, c12);
		
		MatrizComplex mathfinal = MatrixCalculator.mulMatriz(mat1, mat2);
		
		//System.out.println(mathfinal.toString());
		
		//Respuesta
		assertEquals(mat3,mathfinal);


	}
	@Test
	void testMatNor() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);

		
		Double mat3 = new Double(2);
		//math1
		Complex c1 = new Complex(2,2);
		Complex c2 = new Complex(2,0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);
		
		//math answer
		Complex c5 = new Complex(10, 10);
		Complex c6 = new Complex(4, 10);	
		Complex c11 = new Complex(3, -12);
		Complex c12 = new Complex(17, 0);
		
		

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);

		
		Double rfinal = MatrixCalculator.norMatriz(mat1);
		
		//System.out.println(rfinal);
		
		//Respuesta
		assertEquals(mat3,rfinal);
	}
	@Test
	void testMatDis() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		MatrizComplex mat2 = new MatrizComplex(2, 2);
		
		Double mat3 = new Double(5);
		//math1
		Complex c1 = new Complex(2,2);
		Complex c2 = new Complex(2,0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);
		//mat2
		Complex c7 = new Complex(3,0);
		Complex c8 = new Complex(1,4);
		Complex c9 = new Complex(2, 2);
		Complex c10 = new Complex(5, 0);
		//math answer
		Complex c5 = new Complex(10, 10);
		Complex c6 = new Complex(4, 10);	
		Complex c11 = new Complex(3, -12);
		Complex c12 = new Complex(17, 0);
		
		

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);
		
		mat2.addComplex(0, 0, c7);
		mat2.addComplex(0, 1, c8);
		mat2.addComplex(1, 0, c9);
		mat2.addComplex(1, 1, c10);
		
		
		Double mfinal = MatrixCalculator.disMatriz(mat1, mat2);
		
		//System.out.println(mfinal);
		
		//Respuesta
		assertEquals(mat3,mfinal);


	}
	@Test
	void testMatHer() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		MatrizComplex mat2 = new MatrizComplex(2, 2);

		
		Boolean mat3 = false;
		Boolean mat4 = true;
		//math1
		Complex c1 = new Complex(2,2);
		Complex c2 = new Complex(2,0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);

		Complex c5 = new Complex(7,0);
		Complex c6 = new Complex(6,5);
		Complex c7 = new Complex(6,-5);
		Complex c8 = new Complex(-3, 0);
		
		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);
		
		mat2.addComplex(0, 0, c5);
		mat2.addComplex(0, 1, c6);
		mat2.addComplex(1, 0, c7);
		mat2.addComplex(1, 1, c8);
		

		Boolean mfinal1 = MatrixCalculator.isHermitian(mat2);
		Boolean mfinal = MatrixCalculator.isHermitian(mat1);
		
		//System.out.println(mfinal);
		
		//Respuesta
		assertEquals(mat3,mfinal);
		assertEquals(mat4,mfinal1);


	}
	@Test
	void testMatTen() {
		// TestCase
		MatrizComplex mat1 = new MatrizComplex(2, 2);
		MatrizComplex mat2 = new MatrizComplex(2, 2);
		
		MatrizComplex mat3 = new MatrizComplex(2, 2);
		//math1
		Complex c1 = new Complex(2,2);
		Complex c2 = new Complex(2,0);
		Complex c3 = new Complex(1, -4);
		Complex c4 = new Complex(0, 0);
		//mat2
		Complex c7 = new Complex(3,0);
		Complex c8 = new Complex(1,4);
		Complex c9 = new Complex(2, 2);
		Complex c10 = new Complex(5, 0);
		//math answer
		Complex c5 = new Complex(10, 10);
		Complex c6 = new Complex(4, 10);	
		Complex c11 = new Complex(3, -12);
		Complex c12 = new Complex(17, 0);
		
		

		mat1.addComplex(0, 0, c1);
		mat1.addComplex(0, 1, c2);
		mat1.addComplex(1, 0, c3);
		mat1.addComplex(1, 1, c4);
		
		mat2.addComplex(0, 0, c7);
		mat2.addComplex(0, 1, c8);
		mat2.addComplex(1, 0, c9);
		mat2.addComplex(1, 1, c10);
		
		
		mat3.addComplex(0, 0, c5);
		mat3.addComplex(0, 1, c6);
		mat3.addComplex(1, 0, c11);
		mat3.addComplex(1, 1, c12);
		
		MatrizComplex mathfinal = MatrixCalculator.tenMatriz(mat1, mat2);
		
		System.out.println(mathfinal.toString());
		
		//Respuesta
		assertEquals(mat3,mathfinal);


	}
	
}
