package koira.modes;

import koira.Koira;
import koira.varoitus.Alarm;

public class AlarmMode extends Koira {
	private Alarm soundAlarm = new Alarm();
	
	public AlarmMode() {
		while(true) {
			if(sensor.button != 9) {
				this.soundAlarm.alarm();
			}
		}
	}
}
