package com.jyothesh.classes;

public class MountainBike extends Bicycle {

	private int seatHeight;

	public MountainBike(int startHeight, int cadence, int gear, int speed) {
		super(cadence, gear, speed);
		this.seatHeight = startHeight;
	}
	
	public MountainBike(Bicycle bicycle, int startHeight) {
		super(bicycle.getCadence(), bicycle.getGear(), bicycle.getSpeed() );
		this.seatHeight = startHeight;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	public void printMountainBike() {
		printStates();
		System.out.println("SeatHeight: " + seatHeight);		
	}

}
