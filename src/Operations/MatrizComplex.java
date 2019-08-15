package Operations;

public class MatrizComplex {
	int filas,columnas;
	Complex [][] matriz;
	
	public MatrizComplex(int filas,  int columnas) {
		// TODO Auto-generated constructor stub
		this.filas=filas;
		this.columnas=columnas;
		matriz = new Complex[filas][columnas];
	}
	public void addComplex (int fila, int columna, Complex number) {
		matriz[fila][columna]= number; 
	}
	public Complex getPosition (int fila, int columna) {
		return matriz[fila][columna];
	}
	
	public int getFilas() {
		return filas;
	}
	public void setFilas(int filas) {
		this.filas = filas;
	}
	public int getColumnas() {
		return columnas;
	}
	public void setColumnas(int columnas) {
		this.columnas = columnas;
	}

	public MatrizComplex sumMatriz(MatrizComplex math1 , MatrizComplex math2) {
		if (math1.getFilas()==math2.getFilas() && math1.getColumnas()==math2.getColumnas()) {
			MatrizComplex mathfinal = new MatrizComplex(getFilas(), getColumnas());
			Complex sumaComplex;
			for (int i = 0; i < math1.filas; i++) {
				for (int j = 0; j < math1.getColumnas(); j++) {
					sumaComplex = math1.getPosition(i, j).sumComplex(math2.getPosition(i, j));
					mathfinal.addComplex(i, j, sumaComplex);
					
				}
			}
			return mathfinal;
		}else {
			System.out.println("Matrices de dimensiones diferente");
			return null;
		}
	}
	public MatrizComplex resMatriz(MatrizComplex math1 , MatrizComplex math2) {
		if (math1.getFilas()==math2.getFilas() && math1.getColumnas()==math2.getColumnas()) {
			MatrizComplex mathfinal = new MatrizComplex(getFilas(), getColumnas());
			Complex sumaComplex;
			for (int i = 0; i < math1.filas; i++) {
				for (int j = 0; j < math1.getColumnas(); j++) {
					sumaComplex = math1.getPosition(i, j).resComplex(math2.getPosition(i, j));
					mathfinal.addComplex(i, j, sumaComplex);
					
				}
			}
			return mathfinal;
		}else {
			System.out.println("Matrices de dimensiones diferente");
			return null;
		}
	}

}
