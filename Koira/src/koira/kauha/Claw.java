package koira.kauha;

import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class Claw {
	EV3MediumRegulatedMotor claw;
	
	public Claw() {
		this.claw = new EV3MediumRegulatedMotor(MotorPort.B);
	}

	public void clawOpen() {
		this.claw.rotate(60, true);
	}
	
	public void clawClose() {
		this.claw.rotate(-60, true);
	}
}
