package MotionEquations;

/**
 * Created by ZaferSamir on 1/25/2016.
 */
public class Data {

	

	// TODO make a method to set the booleans to true when they variables are known

	private double initialVelocity, velocity, acceleration, initialPosition,
	finalPosition, time;

	private boolean initialVelocityKnown, velocityKnown, accelerationKnown,
	initialPositionKnown, finalPositionKnown, timeKnown;

	public Data(double vo, double v, double acc, double xo,  double x, double t) {

		this.initialVelocity = vo;
		this.velocity = v;
		this.acceleration = acc;
		this.initialPosition = xo;
		this.finalPosition = x;
		this.time = t;

		if (this.initialVelocity != -999)
			this.initialVelocityKnown = true;

		if (this.velocity != -999)
			this.velocityKnown = true;

		if (this.acceleration != -999)
			this.accelerationKnown = true;

		if (this.initialPosition != -999)
			this.initialPositionKnown = true;

		if (this.finalPosition != -999)
			this.finalPositionKnown = true;

		if (this.finalPosition != -999)
			this.finalPositionKnown = true;

		if (this.time != -999)
			this.timeKnown = true;

	}



	public double getInitialVelocity() {
		return initialVelocity;
	}

	public double getVelocity() {
		return velocity;
	}

	public double getAcceleration() {
		return acceleration;
	}

	public double getFinalPosition() {
		return finalPosition;
	}

	public double getInitialPosition(){
		return initialPosition;

	}

	public double getTime() {
		return time;
	}

	//	public void calculateVelocityTD(){
	//		velocity = finalPosition / time;
	//		System.out.println("Used velocity TD");
	//	}

	//	private void calculateTimeVD(){
	//		time = finalPosition / velocity;
	//		System.out.println("Used TimeVD");
	//	}


	
	
	public String toString() {
		String returnedString = "";
		
		if (initialVelocityKnown)
			returnedString += "Initial Velocity: " + this.initialVelocity + "\n";
		
		if (velocityKnown)
			returnedString += "Velocity: " + this.velocity + "\n";
		
		if (accelerationKnown)
			returnedString += "Acceleration: " + this.acceleration + "\n";
		
		if (initialPositionKnown)
			returnedString += "Initial Position: " + this.initialPosition + "\n";
		
		if (finalPositionKnown)
			returnedString += "Final Position: " + this.finalPosition + "\n";
		
		if (timeKnown)
			returnedString += "Time: " + this.time + "\n";
		 
		 return returnedString;
	}
	
	
	private void findFinalVelocity(){

		//		if (!velocityKnown() && finalPositionKnown() && timeKnown() )
		//			calculateVelocityTD();

		if (this.velocityKnown && this.initialVelocityKnown 
				&& this.accelerationKnown && this.timeKnown)
			velocity = MotionEquationsSolver.calculateVelocityVoAT(initialVelocity, acceleration, time);
		else if (!this.velocityKnown && this.initialVelocityKnown 
				&& this.accelerationKnown && this.finalPositionKnown 
				&& this.initialPositionKnown)
			velocity = MotionEquationsSolver.calculateVelocityVoAXoX(initialVelocity, acceleration, initialPosition, finalPosition);
	}

	
	
	private void findFinalPosition(){

		if (!this.finalPositionKnown && this.initialPositionKnown 
				&& this.initialVelocityKnown && this.timeKnown
				&& this.accelerationKnown)
			this.finalPosition = MotionEquationsSolver.calculateFinalPositionVoAXoT(initialVelocity, acceleration, initialPosition, time);
		else if (!this.finalPositionKnown && this.velocityKnown && this.initialVelocityKnown
				&& this.accelerationKnown && this.initialPositionKnown)
			this.finalPosition = MotionEquationsSolver.calculateFinalPositionVoVAXo(initialVelocity, velocity, acceleration, initialPosition);

	}



	private void findTime(){

		if (!this.timeKnown && this.velocityKnown && this.initialVelocityKnown 
				&& this.accelerationKnown)
			this.time = MotionEquationsSolver.calculateTimeVoVA(initialVelocity, velocity, acceleration);
		else if (!this.timeKnown && this.accelerationKnown && this.initialVelocityKnown&&
				this.initialPositionKnown && this.finalPositionKnown)
			this.time = MotionEquationsSolver.calculateTimeVoAXoX(initialVelocity, acceleration, initialPosition, finalPosition);
	}



	private void findAcceleration(){

		if (!accelerationKnown && velocityKnown && initialVelocityKnown && timeKnown)
			this.acceleration = MotionEquationsSolver.calculateAccelerationVoVT(initialVelocity, velocity, time);
		if (!accelerationKnown && velocityKnown && initialVelocityKnown
				&& finalPositionKnown && initialPositionKnown)
			this.acceleration = MotionEquationsSolver.calculateAccelerationVoVXoX(initialVelocity, velocity, initialPosition, finalPosition);
	}



	private void findInitialPosition(){

		if (!this.initialPositionKnown && this.accelerationKnown && this.timeKnown
				&& initialVelocityKnown)
			initialPosition = MotionEquationsSolver.calculateInitialPositionVoAXT(initialVelocity, acceleration, finalPosition, time);
		else if (!this.initialPositionKnown && this.finalPositionKnown && this.velocityKnown &&
				this.initialVelocityKnown && this.accelerationKnown)
			this.initialPosition = MotionEquationsSolver.calculateInitialPositionVoVAX(initialVelocity, velocity, acceleration, finalPosition);
	}

	

	private void findInitialVelocity(){

		if (!initialVelocityKnown && velocityKnown && accelerationKnown && timeKnown)
			this.initialVelocity = MotionEquationsSolver.calculateInitialVelocityVAT(velocity, acceleration, time);

		else if(!initialVelocityKnown && initialPositionKnown && finalPositionKnown
				&& timeKnown && accelerationKnown)
			this.initialVelocity = MotionEquationsSolver.calculateInitialVelocityAXoXT(
					acceleration, initialPosition, finalPosition, time);

		else if (!initialVelocityKnown && velocityKnown && accelerationKnown
				&& finalPositionKnown && initialPositionKnown)
			this.initialVelocity = MotionEquationsSolver.calculateInitialVelocityVXoXA(
					velocity, initialPosition, finalPosition, acceleration);


	}

	private boolean checkData(){
		if (accelerationKnown && timeKnown
				&& finalPositionKnown && velocityKnown
				&& initialPositionKnown && initialVelocityKnown)
			return false;
		return true;
	}

	public void solveData(){
		int tries = 0;

		while(checkData() && tries < 30)
		{
			findAcceleration();
			findFinalPosition();
			findFinalVelocity();
			findInitialPosition();
			findInitialVelocity();
			findTime();
			tries++;

		}
	}
}


