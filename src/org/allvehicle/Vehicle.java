package org.allvehicle;

import org.road.Road;

public class Vehicle extends Road {
	public void VehicleNecessery() {
		System.out.println("Necessary");

	}
	public static void main(String[] args) {
		Vehicle a = new Vehicle();
		a.VehicleNecessery();
		a.bike();
		a.bus();
		a.car();
		a.cycle();
	}

}
