package koira.modes;

import koira.Koira;
import koira.moottori.Movement;

public class RemoteControlMode extends Koira{
	


	public RemoteControlMode() {
		while (true) {
			int remoteCommand = sensor.button;
			
			if(remoteCommand == 1){
				motor.move(Movement.MAX_SPEED, Movement.MAX_SPEED, true, true);
			} else if(remoteCommand == 2){
				motor.move(Movement.MAX_SPEED, Movement.MAX_SPEED, false, false);
			} else if(remoteCommand == 3){
				motor.move(Movement.MAX_SPEED, Movement.MAX_SPEED, false, true);
			} else if(remoteCommand == 4){
				motor.move(Movement.MAX_SPEED, Movement.MAX_SPEED, true, false);
			} else if(remoteCommand == 0){
				motor.stop();
			}
		}
	}
	
	
}
