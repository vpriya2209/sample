package org.water;

import org.air.Air;

public class water extends Air {
	public void boat() {
		System.out.println("2 boat");
	}
	public void ship() {
		System.out.println("3 ship");
	}
	public static void main(String[] args) {
		water w = new water();
		w.bike();
		w.car();
		w.cycle();
		w.aeroPlane();
		w.heliCopter();
		w.VehicleNecessery();
		w.bus();
	}
}
