package Operations;

public class Complex {
	double x;
	double y;
	double module;
	double fase;

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

	public double getImaginario() {
		return y;
	}

	public void setImaginario(double y) {
		this.y = y;
	}

	public Complex(double real, double y) {
		this.x = real;
		this.y = y;
		this.setModule();
		this.setFase();

	}
	/**
	 * fase de un copmlejo
	 */
	public double setFase() {
		// TODO Auto-generated method stub
		return this.fase = Math.atan(y / x);

	}

	/**
	 * Modulo de un copmlejo
	 */

	public double setModule() {
		return this.module = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

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
		Complex numerador = divComplex1.mulComplex(conComplex(divComplex2));
		Complex denominador = divComplex2.mulComplex(conComplex(divComplex2));
		double real = numerador.x / denominador.x;
		double imaginario;
		if (denominador.y != 0) {
			imaginario = numerador.y / denominador.y;
		} else {
			imaginario = numerador.y / denominador.x;
		}

		return new Complex(real, imaginario);

	}

	/**
	 * Conjugado de un complejo
	 */
	public Complex conComplex(Complex conComplex) {
		return new Complex(conComplex.x, -conComplex.y);

	}
	/**
	 * Forma cartesiana de de un complejo 
	 */
	public Complex setPolartoCartesian(double radius, double degrees) {
		degrees = degrees * (Math.PI / 180);
		x = radius * Math.cos(degrees);
		y = radius * Math.sin(degrees);
		return new Complex(x, y);
		// TODO Auto-generated method stub

	}
	/**
	 * Forma polar de de un complejo 
	 */

	public Complex setCartesiantoPolar(Complex carteComplex) {
		double radius = carteComplex.setModule();
		double degrees = Math.toDegrees(carteComplex.setFase());
		System.out.println(radius);

		return new Complex(radius, degrees);
		// TODO Auto-generated method stub

	}

}
