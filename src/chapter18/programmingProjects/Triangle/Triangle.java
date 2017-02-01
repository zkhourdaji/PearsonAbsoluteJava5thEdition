package chapter18.programmingProjects.Triangle;

import java.awt.Point;
import java.util.Random;

public class Triangle {

	private Point currentPoint;
	private Point targetPoint; // will be random x, y or z

	private Point x, y, z; // corners of triangle

	public Triangle(Point x, Point y, Point z) {

		this.x = x;
		this.y = y;
		this.z = z;

		// temp value
		this.currentPoint = x;

	}



	public Point pointToDraw(){

		/*
		 * this method will return a point to draw on the screen.
		 * the loop will be outside this class actually,
		 * it will be in the paint method for two reasons.
		 * first this method will return only one point so it must be
		 * looped somewhere else, second reason is that for us to draw the pixel
		 * we have to access the JFrame.
		 * 
		 * 1- set current equal to point x.
		 * 
		 * 2- Loop:
		 * 	
		 * 	1) randomly pick this.targetPoint as x, y or z
		 * 	2) calculate the halfway point between current and target
		 * 	3) set current to the halfway point
		 * 
		 * 
		 * 	-- this last step will be in the paint method --
		 * 	4)draw pixel at location current.
		 */

		Random r = new Random();


		switch(r.nextInt(3)){

		case 0:
			this.targetPoint = x;
			break;

		case 1:
			this.targetPoint = y;
			break;

		case 2:
			this.targetPoint = z;
			break;

		default:
			System.out.println("Default should NOT happen!!");
			break;

		}

		//halfway x and y
		int halfway_x = (int) Math.abs(this.currentPoint.getX() + this.targetPoint.getX()) / 2;
		int halfway_y = (int) Math.abs(this.currentPoint.getY() + this.targetPoint.getY()) /2;

		this.currentPoint = new Point(halfway_x, halfway_y);

		return this.currentPoint;

	}



	public Point getCurrentPoint() {
		return currentPoint;
	}



	public Point getTargetPoint() {
		return targetPoint;
	}



	public Point getX() {
		return x;
	}



	public Point getY() {
		return y;
	}



	public Point getZ() {
		return z;
	}

}
