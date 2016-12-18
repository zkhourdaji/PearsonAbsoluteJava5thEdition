package chapter5.ProgrammingProjects;

import java.util.Random;

public class Duelist {

	private String name;
	private double accuracy; // percentage
	private boolean stillAlive;
	private static int numberOfDuelists;
	private static int numberOfAliveDuelsts;


	public Duelist(String name, double accuracy) {
		this.stillAlive = true;
		this.name = name;
		this.accuracy = accuracy;
		Duelist.numberOfDuelists++;
		Duelist.numberOfAliveDuelsts++;
	}

	public static int getNumberOfAliveDuelists(){
		return Duelist.numberOfAliveDuelsts;
	}

	public static int getNumberOfDuelists(){
		return Duelist.numberOfDuelists;
	}
	// sets the target dead if hit
	public void shootAtTarget(Duelist target){

		double chance = Math.random();
		System.out.println(this.name + " attacked " + target.name);
		if (chance < accuracy){
			System.out.println(target.name + " is dead ");
			target.killed();
		}
		else 
			System.out.println(this.name + " missed ");

	}
	
	public String getName(){
		return this.name;
	}

	public boolean isAlive(){
		return this.stillAlive;
	}

	public boolean isDead(){
		return !this.stillAlive;
	}

	public void killed(){
		Duelist.numberOfAliveDuelsts--;
		this.stillAlive = false;
	}

	public void respawn(){
		if (this.isDead()){
			Duelist.numberOfAliveDuelsts++;
			this.stillAlive = true;
		}
	}

}
