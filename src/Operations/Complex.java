package Operations;

public class Complex {
	double x;
	double y;
	double module;

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

	}

	public double setModule() {
		return this.module = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		
	}

	public void setModule(double module) {
		this.module = module;
	}

	public String toString() {
		return x + " " + y + "i";

	}

	public Complex sumComplex(Complex sumcomplejo) {
		return new Complex(this.x + sumcomplejo.x, this.y + sumcomplejo.y);

	}

	public Complex resComplex(Complex rescomplejo) {
		return new Complex(this.x - rescomplejo.x, this.y - rescomplejo.y);

	}

	public Complex mulComplex(Complex mulcomplejo) {
		return new Complex((this.x * mulcomplejo.x - this.y * mulcomplejo.y),
				(this.x * mulcomplejo.y + this.y * mulcomplejo.x));

	}
	public Complex divComplex(Complex divComplex) {
		return divComplex(this, divComplex);
		
	}

	public Complex divComplex(Complex divComplex1, Complex divComplex2) {
		double xx = (divComplex1.x * divComplex2.x + divComplex1.y * divComplex2.y)
				/ (Math.pow(divComplex2.x, 2) + Math.pow(divComplex2.y, 2));
		double yy = (divComplex1.y * divComplex2.x - divComplex1.x * divComplex2.y)
				/ (Math.pow(divComplex2.x, 2) + Math.pow(divComplex2.y, 2));
		return new Complex(xx, yy);

	}
	public Complex conComplex(Complex conComplex) {
		return new Complex(conComplex.x, -conComplex.y);
		
	}
	

}
