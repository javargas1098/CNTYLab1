package Operations;

public class Complex {
	double x;
	double y;
	double module;
	double fase;
	double degrees;
	public double getDegrees() {
		return degrees;
	}

	public void setDegrees(double degrees) {
		this.degrees = degrees;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	double radius;

	public double getFase() {
		return fase;
	}

	public void setFase(double fase) {
		this.fase = fase;
	}

	public double getReal() {
		return x;
	}

	public void setReal(double x) {
		this.x = x;
	}

	public double getComplejo() {
		return y;
	}

	public void setComplejo(double y) {
		this.y = y;
	}

	public Complex(double real, double y) {
		this.x = real;
		this.y = y;
		this.setModule();
		this.setFase();
		this.setCartesiantoPolar();
		this.setPolartoCartesian();

	}
	private void setPolartoCartesian(double radius, double degrees) {
		// TODO Auto-generated method stub
		
		
	}

	public double[] setCartesiantoPolar() {
		double[] cartesian = new double[2];
		double radio = setModule();
		double angulo = Math.toDegrees(setFase());
		cartesian[0]=radio;
		cartesian[1]=angulo;
		return cartesian;
		// TODO Auto-generated method stub
		
	}

	/**
	 * fase  de un copmlejo 
	 */
	private double setFase() {
		// TODO Auto-generated method stub
		return this.fase = Math.atan(y/x);
		
		
	}

	/**
	 * Modulo  de un copmlejo 
	 */

	public double setModule() {
		return this.module = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		
	}

	public void setModule(double module) {
		this.module = module;
	}

	public String toString() {
		return x + " + " + y + "i";

	}
	/**
	 * Suma de complejos
	 */

	public Complex sumComplex(Complex sumcomplejo) {
		return new Complex(this.x + sumcomplejo.x, this.y + sumcomplejo.y);

	}
	/**
	 * Resta de complejos 
	 */

	public Complex resComplex(Complex rescomplejo) {
		return new Complex(this.x - rescomplejo.x, this.y - rescomplejo.y);

	}
	/**
	 * CoMultiplicaion de complejos 
	 */

	public Complex mulComplex(Complex mulcomplejo) {
		return new Complex((this.x * mulcomplejo.x - this.y * mulcomplejo.y),
				(this.x * mulcomplejo.y + this.y * mulcomplejo.x));

	}
	public Complex divComplex(Complex divComplex) {
		return divComplex(this, divComplex);
		
	}
	/**
	 * Division de complejos
	 */

	public Complex divComplex(Complex divComplex1, Complex divComplex2) {
		double denominador = (divComplex1.y * divComplex2.x - divComplex1.x * divComplex2.y)
				/ (Math.pow(divComplex2.x, 2) + Math.pow(divComplex2.y, 2));
		double numerador = (divComplex1.x * divComplex2.x + divComplex1.y * divComplex2.y)
				/ (Math.pow(divComplex2.x, 2) + Math.pow(divComplex2.y, 2));
		
		return new Complex(numerador, denominador);

	}
	/**
	 * Conjugado de un complejo
	 */
	public Complex conComplex(Complex conComplex) {
		return new Complex(conComplex.x, -conComplex.y);
		
	}
	
	
	

}
