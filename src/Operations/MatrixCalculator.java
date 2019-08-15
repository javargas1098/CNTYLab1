package Operations;

public class MatrixCalculator {
	
	public static MatrizComplex sumMatrix(MatrizComplex mat1 , MatrizComplex mat2) {
		if (mat1.getFilas()==mat2.getFilas() && mat1.getColumnas()==mat2.getColumnas()) {
			MatrizComplex mathfinal = new MatrizComplex(mat1.getFilas(), mat1.getColumnas());
			Complex rtaComplex;
			for (int i = 0; i < mat1.getFilas(); i++) {
				for (int j = 0; j < mat1.getColumnas() || mat1.getColumnas() == 0; j++) {
					rtaComplex = mat1.getPosition(i, j).sumComplex(mat2.getPosition(i, j));
					mathfinal.addComplex(i, j, rtaComplex);
					
				}
			}
			return mathfinal;
		}else {
			System.out.println("Matrices de dimensiones diferentes");
			return null;
		}
	}
	public static MatrizComplex resMatrix(MatrizComplex mat1 , MatrizComplex mat2) {
		return sumMatrix(mat1, negMatrix(mat2));
	}
	
	public static MatrizComplex negMatrix( MatrizComplex mat1) {
		MatrizComplex mathfinal = new MatrizComplex(mat1.getFilas(), mat1.getColumnas());
		Complex rtaComplex;
		for (int i = 0; i < mat1.getFilas(); i++) {
			for (int j = 0; j < mat1.getColumnas() || mat1.getColumnas() == 0; j++) {
				rtaComplex = mat1.getPosition(i, j).mulComplex(new Complex(-1, 0));
				mathfinal.addComplex(i, j, rtaComplex);
				
			}
		}
		return mathfinal;
		
	}
	public static MatrizComplex scalarMatrix(Complex c,MatrizComplex mat1) {
		MatrizComplex mathfinal = new MatrizComplex(mat1.getFilas(), mat1.getColumnas());
		Complex rtaComplex;
		for (int i = 0; i < mat1.getFilas(); i++) {
			for (int j = 0; j < mat1.getColumnas() || mat1.getColumnas() == 0; j++) {
				rtaComplex = mat1.getPosition(i, j).mulComplex(c);
				mathfinal.addComplex(i, j, rtaComplex);
				
			}
		}
		return mathfinal;
		
	}
	public static MatrizComplex trasMatrix(MatrizComplex mat1) {
		MatrizComplex matfinal = new MatrizComplex(mat1.getFilas(), mat1.getColumnas());
		Complex rtaComplex;
		for (int i = 0; i < mat1.getFilas(); i++) {
			for (int j = 0; j < mat1.getColumnas() || mat1.getColumnas() == 0; j++) {
				rtaComplex = mat1.getPosition(i, j);
				matfinal.addComplex(j, i, rtaComplex);			
			}
		}
		return matfinal;
		
	}
	public static MatrizComplex conMatrix(MatrizComplex mat1) {
		MatrizComplex matfinal = new MatrizComplex(mat1.getFilas(), mat1.getColumnas());
		Complex rtaComplex;
		Complex con = new Complex(0, 0);
		for (int i = 0; i < mat1.getFilas(); i++) {
			for (int j = 0; j < mat1.getColumnas() || mat1.getColumnas() == 0; j++) {
				rtaComplex = con.conComplex(mat1.getPosition(i, j));
				matfinal.addComplex(j, i, rtaComplex);			
			}
		}
		return matfinal;
		
	}
	public static MatrizComplex adjMatrix(MatrizComplex mat1) {
		return trasMatrix(conMatrix(mat1));
		
	}
	

}
