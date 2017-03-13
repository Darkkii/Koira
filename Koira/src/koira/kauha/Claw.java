package koira.kauha;

import koira.Koira;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;

public class Claw extends Koira {
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
