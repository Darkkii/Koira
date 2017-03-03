package koira.seuranta;

import koira.seuranta.liike.Movement;
import koira.seuranta.sensorit.BeaconLocation;

public class FollowMode {
	private Movement move;
	private float[] target;
	
	public FollowMode() {
		this.move = new Movement();
		this.target = new BeaconLocation().getLocation();
		
		if(this.target[0] > 0 || this.target[0] < 0) {
			this.move.turn(50, this.target[0]);
		} else if(this.target[0] == 0 && this.target[1] != Float.POSITIVE_INFINITY) {
			this.move.forward();
		} else if(this.target[1] == Float.POSITIVE_INFINITY) {
			this.move.turn(500, 0);
		}
	}
}
