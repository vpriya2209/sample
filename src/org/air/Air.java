package org.air;

import org.allvehicle.Vehicle;

public class Air extends Vehicle {
	public void aeroPlane() {
		System.out.println(  "3 aeropalne");
	
	}
	public void heliCopter() {
		System.out.println( " 8 heliCopter");

	}
	public static void main(String[] args) {
		Air b = new Air();
		b.aeroPlane();
		b.bike();
		b.bus();
		b.car();
		b.cycle();
		b.heliCopter();
		b.VehicleNecessery();
		
	}
}
