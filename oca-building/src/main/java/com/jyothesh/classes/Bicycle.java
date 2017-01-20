package com.jyothesh.classes;

/*
 * Simple Bicycle class that demonstrates about and class state and 
 * behavior
 */
public class Bicycle {

	int cadence = 0;
	int gear = 0;
	int speed = 0;
	
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
