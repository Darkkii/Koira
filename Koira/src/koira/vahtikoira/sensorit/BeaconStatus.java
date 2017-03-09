package koira.vahtikoira.sensorit;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3IRSensor;

public class BeaconStatus {
	private EV3IRSensor beacon;
	
	public BeaconStatus() {
		this.beacon = new EV3IRSensor(SensorPort.S1);
	}
	
	public boolean getBeaconStatus() {
		int status = this.beacon.getRemoteCommand(0);
		if(status == 9){
			return true;
		} else {
			return false;
		}
	}
}
