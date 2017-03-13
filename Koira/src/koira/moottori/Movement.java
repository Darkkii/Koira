package koira.moottori;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;

public class Movement {
	private EV3LargeRegulatedMotor rmotor;
	private EV3LargeRegulatedMotor lmotor;
	public static final int MAX_SPEED = 500;
	
	public Movement() {
		this.rmotor = new EV3LargeRegulatedMotor(MotorPort.A);
		this.lmotor = new EV3LargeRegulatedMotor(MotorPort.D);
		rmotor.synchronizeWith(new RegulatedMotor[] {this.lmotor});
	}
	
	// Moottorien nopeuden säädöt ja suunnan valinta
	
	public void move(int rSpeed, int lSpeed, boolean rDirection, boolean lDirection) {
		this.rmotor.setSpeed(rSpeed);
		this.lmotor.setSpeed(lSpeed);
		this.rmotor.startSynchronization();
		if(rDirection == true) {
			this.rmotor.forward();
		} else {
			this.rmotor.backward();
		}
		if(lDirection == true) {
			this.lmotor.forward();
		} else {
			this.lmotor.backward();
		}
		this.rmotor.endSynchronization();
	}

	public void stop() {
		this.rmotor.startSynchronization();
		this.rmotor.stop();
		this.lmotor.stop();
		this.rmotor.endSynchronization();
	}
}
