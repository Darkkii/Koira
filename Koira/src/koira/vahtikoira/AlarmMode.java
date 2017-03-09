package koira.vahtikoira;

import koira.vahtikoira.sensorit.BeaconStatus;
import koira.vahtikoira.varoitus.Alarm;

public class AlarmMode {
	private BeaconStatus checkBeacon = new BeaconStatus();;
	private Alarm soundAlarm = new Alarm();
	
	public AlarmMode() {
		while(true) {
			if(this.checkBeacon.getBeaconStatus() == false) {
				this.soundAlarm.alarm();
			}
		}
	}
}
