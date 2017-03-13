package Moodit;

import koira.Koira;
import koira.moottori.Movement;

public class FollowMode extends Koira {
	
	private int speed;
	private float beacon;
	public FollowMode() {
		
		while(true) {
			if(sensor.location != 0) {
				this.beacon = sensor.location;
			}
			
			if(sensor.location == 0 && sensor.distance != Float.POSITIVE_INFINITY) {
				// Suoraan
				motor.move(Movement.MAX_SPEED, Movement.MAX_SPEED, true, true);
			} else if(sensor.location != 0 && this.beacon < 0) {
				// Käännös vasemmalle
				this.speed = (int)(500 + sensor.location * 20);
				if(this.beacon == -25) {
					motor.move(Movement.MAX_SPEED, Movement.MAX_SPEED, true, false);
				} else {
					motor.move(Movement.MAX_SPEED, this.speed, true, true);
				}
			} else if(sensor.location != 0 && this.beacon > 0) {
				// Käännös oikealle
				this.speed = (int)(500 - sensor.location * 20);
				if(this.beacon == 25) {
					motor.move(Movement.MAX_SPEED, Movement.MAX_SPEED, false, true);
				} else {
					motor.move(this.speed, Movement.MAX_SPEED, true, true);
				}
			}
		}
	}
}
