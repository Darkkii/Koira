package koira.seuranta.sensorit;

import lejos.hardware.sensor.*;
import lejos.hardware.port.*;

public class BeaconLocation {
	private EV3IRSensor seek;
	private float[] location;
	
	public BeaconLocation() {
		this.seek = new EV3IRSensor(SensorPort.S4);
		this.seek.fetchSample(this.location, 0);
	}
	
	public float[] getLocation() {
		return this.location;
	}
}