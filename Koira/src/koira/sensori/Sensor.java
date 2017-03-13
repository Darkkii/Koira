package koira.sensori;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3IRSensor;

public class Sensor extends Thread {
	private EV3IRSensor sensor;
	private float[] seekArray;
	public float location;
	public float distance;
	public int button;
	
	public Sensor() {
		this.sensor = new EV3IRSensor(SensorPort.S4);
	}
	
	public void run() {
		while (true) {
			this.sensor.fetchSample(this.seekArray, 0);
			this.location = this.seekArray[0];
			this.distance = this.seekArray[1];
			this.button = this.sensor.getRemoteCommand(0);
		}
	}
}
