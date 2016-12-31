package chapter5.programmingProjects;

public class Fraction {

	
	private int numerator;
	private int denomenator;
	
	
	public Fraction(int numerator, int denomenator) {
		this.numerator = numerator;
		this.denomenator = denomenator;
	}
	
	
	
	public boolean equals(Fraction otherFraction) {
		if ((this.numerator / this.denomenator) 
				== (otherFraction.numerator / otherFraction.denomenator))
			return true;
		return false;
	}
	
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenomenator() {
		return denomenator;
	}
	public void setDenomenator(int denomenator) {
		this.denomenator = denomenator;
	}
	
	public String toString() {
		return this.numerator + "/" + this.denomenator;
	}
	
}
