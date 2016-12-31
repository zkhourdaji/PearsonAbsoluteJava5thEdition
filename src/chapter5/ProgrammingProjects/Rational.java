package chapter5.programmingProjects;

public class Rational {

	int numerator, denominator;

	/**
	 * This constructor simply takes two integers and sets
	 * the first to the numerator and the second to the denominator;
	 * 
	 * @param numerator Numerator of rational number
	 * @param denomenator denominator of rational number	 
	 */
	public Rational(int numerator, int denomenator) {
		this.numerator = numerator;
		this.denominator = denomenator;

	}

	/**
	 * this constructor sets the numerator to the passed integer,
	 * and sets the denominator to 1;
	 * 
	 * @param numerator the numerator of a rational number;
	
	 */
	public Rational(int numerator) {
		this.numerator = numerator;
		this.denominator = 1;
	}

	/**
	 * Sets the numerator to 0 and denominator to 1
	 */
	public Rational() {
		this.numerator = 0;
		this.denominator = 1;

	}

	/**
	 * If the numerator is positive and the denominator is negative,
	 * this method makes the numerator negative and the denominator positive.
	 * 
	 * If the numerator and the denominator both are negative,
	 * this method change them to positive.
	 * 
	 * If the numerator is negative and the denominator is positive, do nothing.
	 */
	public void normalizeSign(){

		if (this.denominator < 0){
			this.numerator = this.numerator * -1;
			this.denominator = this.denominator * -1;
		}


	}

	/**
	 * 
	 * @param r1 Rational object1
	 * @param r2 Rational object2
	 * 
	 * @return a new Rational object which is the result of adding Rational object1 and object2
	 */
	public static Rational add(Rational r1, Rational r2){

		if (r1.denominator == r2.denominator)
			return new Rational(r1.numerator + r2.numerator, r2.denominator);
		else
			return new Rational((r1.numerator * r2.denominator) + (r1.denominator * r2.numerator), 
					r1.denominator * r2.denominator);
	}

	/**
	 * 
	 * @param r1 Rational object1
	 * @param r2 Rational object2
	 * 
	 * @return a new Rational object which is the result of subtracting Rational object2 from object1
	 */
	public static Rational subtract(Rational r1, Rational r2){
		if (r1.denominator == r2.denominator)
			return new Rational(r1.numerator - r2.numerator, r2.denominator);
		else
			return new Rational((r1.numerator * r2.denominator) - (r1.denominator * r2.numerator), 
					r1.denominator * r2.denominator);
	}

	/**
	 * 
	 * @param r1 Rational object1
	 * @param r2 Rational object2
	 * 
	 * @return a new Rational object which is the result of multiplying Rational object1 by object2
	 */
	
	public static Rational multiply(Rational r1, Rational r2){
		return new Rational(r1.numerator * r2.numerator, r1.denominator * r2.denominator);
	}
	
	/**
	 * 
	 * @param r1 Rational object1
	 * @param r2 Rational object2
	 * 
	 * @return a new Rational object which is the result of dividing Rational object1 by object2
	 */
	

	public static Rational divide(Rational r1, Rational r2){
		return new Rational(r1.numerator * r2.denominator, r1.denominator * r2.numerator);
	}
	
	/**
	 * 
	 * @param otherRational Rational object
	 * 
	 * @return a new Rational object which is the result of adding the calling Rational object
	 *  and the Rational object parameter
	 */
	public Rational add(Rational otherRational){

		if (this.denominator == otherRational.denominator)
			return new Rational(this.numerator + otherRational.numerator, 
					otherRational.denominator);
		else
			return new Rational((this.numerator * otherRational.denominator) 
					+ (this.denominator * otherRational.numerator), 
					this.denominator * otherRational.denominator);
	}

	/**
	 * 
	 *@param otherRational Rational object
	 * 
	 * @return a new Rational object which is the result of subtracting the Rational parameter object 
	 * from the calling object
	 */
	public Rational subtract(Rational otherRational){
		if (this.denominator == otherRational.denominator)
			return new Rational(this.numerator - otherRational.numerator, otherRational.denominator);
		else
			return new Rational((this.numerator * otherRational.denominator) - (this.denominator * otherRational.numerator), 
					this.denominator * otherRational.denominator);
	}
	
	/**
	 * 
	 * @param otherRational Rational object
	 * 
	 * @return a new Rational object which is the result of multiplying the calling Rational object
	 *  by the Rational object parameter
	 */
	public Rational multiply(Rational otherRational){
		return new Rational(this.numerator * otherRational.numerator, 
				this.denominator * otherRational.denominator);
	}

	/**
	 * 
	 * @param otherRational Rational object
	 * 
	 * @return a new Rational object which is the result of dividing the calling Rational object
	 *  and the Rational object parameter
	 */
	public Rational divide(Rational otherRational){
		return new Rational(this.numerator * otherRational.denominator, 
				this.denominator * otherRational.numerator);
	}


	/**
	 * @return a string that represents the rational number. i.e. "1/2"
	 */
	public String toString() {
		return this.numerator + "/" + this.denominator;
	}


	/**
	 * Compare the two rational numbers using this rule
	 * "two fractions are equivalent (equal) only if the product of the numerator
	 *  of the first fraction and the denominator of the other fraction is equal 
	 *  to the product of the denominator of the 
	 *  first fraction and the numerator of the other fraction."
	 * 
	 * @param otherRational Rational object to compare with the calling object
	 * @return true if the calling object is equal to the parameter object
	 */
	public boolean equals(Rational otherRational) {
		return (this.numerator * otherRational.denominator)
				== (otherRational.numerator * this.denominator) ;
	}

	/**
	 * 
	 * @return the numerator
	 */
	public int getNumerator() {
		return this.numerator;
	}

	/**
	 * 
	 * @return the denominator
	 */
	public int getDenomenator() {
		return this.denominator;
	}





}
