package Operations;

public class Complex {
	double x;
	double y;

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

	}
	public String toString() {
		return x + " " + y + "i";
		
	}
	public Complex sumComplex(Complex sumcomplejo) {
		return new Complex(this.x + sumcomplejo.x , this.y + sumcomplejo.y);
		
	}
	public Complex resComplex(Complex rescomplejo) {
		return new Complex(this.x - rescomplejo.x , this.y - rescomplejo.y);
		
	}
	public Complex mulComplex(Complex mulcomplejo) {
		return new Complex((this.x * mulcomplejo.x -  this.y * mulcomplejo.y),(this.x * mulcomplejo.y + this.y * mulcomplejo.x));
		
	}



}


