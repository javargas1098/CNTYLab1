package Operations;

public class MatrixCalculator {

	public static MatrizComplex sumMatrix(MatrizComplex mat1, MatrizComplex mat2) {
		if (mat1.getFilas() == mat2.getFilas() && mat1.getColumnas() == mat2.getColumnas()) {
			MatrizComplex mathfinal = new MatrizComplex(mat1.getFilas(), mat1.getColumnas());
			Complex rtaComplex;
			for (int i = 0; i < mat1.getFilas(); i++) {
				for (int j = 0; j <= mat1.getColumnas() || mat1.getColumnas() == 1; j++) {
					rtaComplex = mat1.getPosition(i, j).sumComplex(mat2.getPosition(i, j));
					mathfinal.addComplex(i, j, rtaComplex);

				}
			}
			return mathfinal;
		} else {
			System.out.println("Matrices de dimensiones diferentes");
			return null;
		}
	}

	public static MatrizComplex resMatrix(MatrizComplex mat1, MatrizComplex mat2) {
		return sumMatrix(mat1, negMatrix(mat2));
	}

	public static MatrizComplex negMatrix(MatrizComplex mat1) {
		MatrizComplex mathfinal = new MatrizComplex(mat1.getFilas(), mat1.getColumnas());
		Complex rtaComplex;
		for (int i = 0; i < mat1.getFilas(); i++) {
			for (int j = 0; j <= mat1.getColumnas() || mat1.getColumnas() == 1; j++) {
				rtaComplex = mat1.getPosition(i, j).mulComplex(new Complex(-1, 0));
				mathfinal.addComplex(i, j, rtaComplex);

			}
		}
		return mathfinal;

	}

	public static MatrizComplex scalarMatrix(Complex c, MatrizComplex mat1) {
		MatrizComplex mathfinal = new MatrizComplex(mat1.getFilas(), mat1.getColumnas());
		Complex rtaComplex;
		for (int i = 0; i < mat1.getFilas(); i++) {
			for (int j = 0; j <= mat1.getColumnas() || mat1.getColumnas() == 1; j++) {
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
			for (int j = 0; j <= mat1.getColumnas() || mat1.getColumnas() == 1; j++) {
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
			for (int j = 0; j <= mat1.getColumnas(); j++) {
				rtaComplex = con.conComplex(mat1.getPosition(i, j));
				matfinal.addComplex(j, i, rtaComplex);
			}
		}
		return matfinal;

	}

	public static MatrizComplex adjMatrix(MatrizComplex mat1) {
		return trasMatrix(conMatrix(mat1));

	}

	public static MatrizComplex MulMatriz(MatrizComplex mat1, MatrizComplex mat2) {
		if (mat1.getColumnas() == mat2.getFilas()) {
			MatrizComplex matfinal = new MatrizComplex(mat1.getFilas(), mat2.getColumnas());
			for (int i = 0; i < mat1.getFilas(); i++) {
				for (int j = 0; j <= mat2.getColumnas(); j++) {
					Complex suma = new Complex(0, 0);
					for (int k = 0; k < mat1.getColumnas(); k++) {
						suma = suma.sumComplex(mat1.getPosition(i, k).mulComplex(mat2.getPosition(k, j)));

					}
					matfinal.addComplex(i, j, suma);
				}
			}
			return matfinal;

		} else {
			System.out.println("Matrices de dimensiones no compatibles");
			return null;
		}
	}

	public static double NorMatriz(MatrizComplex mat1) {
		double normaMayor = 0;
		for (int i = 0; i < mat1.getFilas(); i++) {
			double normaActual = 0;
			for (int j = 0; j <= mat1.getColumnas(); j++) {
				normaActual = +mat1.getPosition(i, j).setModule();
			}
			if (normaActual > normaMayor) {
				normaMayor = normaActual;

			}
		}
		return normaMayor;
	}

	public static double disMatriz(MatrizComplex mat1, MatrizComplex mat2) {
		if (mat1.getFilas() == mat2.getFilas() && mat1.getColumnas() == mat2.getColumnas()) {
			MatrizComplex rtaComplex = new MatrizComplex(mat1.getFilas(), mat1.getColumnas());
			rtaComplex = resMatrix(mat1, mat2);
			return NorMatriz(rtaComplex);
		} else {
			System.out.println("Matrices de dimensiones diferentes");
			return 0;
		}

	}

	public static boolean isHermitian(MatrizComplex mat1) {

		if (mat1.getColumnas() == mat1.getFilas()) {
			MatrizComplex matactual = new MatrizComplex(mat1.getFilas(), mat1.getColumnas());
			MatrizComplex matfinal = new MatrizComplex(mat1.getFilas(), mat1.getColumnas());
			Complex rtaComplex = new Complex(0, 0);
			for (int i = 0; i < mat1.getFilas(); i++) {
				for (int j = 0; j <= mat1.getColumnas(); j++) {
					matactual.addComplex(i, j, rtaComplex.conComplex(mat1.getPosition(i, j)));
					matfinal.addComplex(j, i, matactual.getPosition(i, j));
				}
			}
			return equalMatiz(mat1, matfinal);
		} else {
			return false;
		}
	}

	public static boolean equalMatiz(MatrizComplex mat1, MatrizComplex mat2) {
		boolean flag = true;
		if ((mat1.getFilas() != mat2.getFilas()) || (mat1.getColumnas() != mat2.getColumnas())) {
			flag = false;
		} else {
			for (int i = 0; i < mat1.getFilas(); i++) {
				for (int j = 0; j <= mat1.getColumnas(); j++) {
					if (!(mat1.getPosition(i, j).equalComplex(mat2.getPosition(i, j)))) {
						flag = false;
					}
				}
			}

		}
		return flag;

	}

	public static MatrizComplex tenMatriz(MatrizComplex mat1, MatrizComplex mat2) {
		int cola = mat1.getColumnas();
		int rowa = mat1.getFilas();
		int colb = mat2.getColumnas();
		int rowb = mat2.getFilas();
		MatrizComplex matFinal = new MatrizComplex((mat1.getFilas() * mat1.getFilas()),
				((mat1.getColumnas() * mat1.getColumnas())));
		for (int i = 0; i < rowa; i++) {
			for (int k = 0; k <= rowb; k++) {
				for (int j = 0; j < cola; j++) {
					for (int l = 0; l < colb; l++) {
						matFinal.addComplex((i + l + 1), (j + k + 1),
								mat1.getPosition(i, j).mulComplex(mat2.getPosition(k, l)));
					}

				}

			}
		}
		return matFinal;

	}

}
