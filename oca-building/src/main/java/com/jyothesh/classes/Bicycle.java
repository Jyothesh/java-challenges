package com.jyothesh.classes;

/*
 * Simple Bicycle class that demonstrates about and class state and 
 * behavior
 */
public class Bicycle {

	private int cadence = 0;
	private int gear = 0;
	private int speed = 0;
	
	public Bicycle() {
		
	}
	
	public int getCadence() {
		return cadence;
	}

	public int getGear() {
		return gear;
	}
	
	public int getSpeed() {
		return speed;
	}

	public Bicycle(int cadence, int gear, int speed) {
		this.cadence = cadence;
		this.gear = gear;
		this.speed = speed;
	}

	void changeCadence(int cadence) {
		this.cadence = cadence;
	}

	void changeGear(int gear) {
		this.gear = gear;
	}
	
	void speedUp(int speed) {
		this.speed = this.speed + speed;
	}
	
	void applyBrakes(int decrement) {
		this.speed = this.speed - decrement;
	}
	
	void printStates() {
		System.out.println("cadence:" +
	             cadence + " speed:" + 
	             speed + " gear:" + gear);
	}
}
