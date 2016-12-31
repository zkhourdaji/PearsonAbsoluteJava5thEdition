package chapter5.programmingProjects;

public class Complex {

	private double real, imaginary;
	
	
	public Complex(double realPart, double imaginaryPart) {
		this.real = realPart;
		this.imaginary = imaginaryPart;
	}
	
	
	public Complex(double realPart) {
		this.real = realPart;
		this.imaginary  =0;
	}
	
	public Complex() {
		this.real = 0;
		this.imaginary = 0;
	}
	
	public static Complex add(Complex a, Complex b){
		return new Complex(a.real + b.real,
				a.imaginary + b.imaginary);
		
	}
	
	public static Complex subtract(Complex a, Complex b){
		return new Complex(a.real - b.real,
				a.imaginary - b.imaginary);
		
	}
	
	public static Complex multiply(Complex a, Complex b){
		return new Complex((a.real * b.real) - (a.imaginary * b.imaginary), 
				(a.real * b.imaginary) + a.imaginary * b.real);
		
	}
	
	public  Complex add(Complex otherComplex){
		return new Complex(this.real + otherComplex.real,
				this.imaginary + otherComplex.imaginary);
		
	}
	
	public Complex subtract(Complex otherComplex){
		return new Complex(this.real - otherComplex.real,
				this.imaginary - otherComplex.imaginary);
		
	}
	
	public Complex multiply(Complex otherComplex){
		return new Complex((this.real * otherComplex.real) - (this.imaginary * otherComplex.imaginary), 
				(this.real * otherComplex.imaginary) + this.imaginary * otherComplex.real);
		
	}
	
	
	public String toString() {
		if (this.imaginary >= 0 )
			return this.real + " + " + this.imaginary + "*i";
		else
			return this.real + " - " + (this.imaginary*-1) + "*i";
	}
	
	
	public boolean equals(Object obj) {
		return false;
	}
	
	
	
}
