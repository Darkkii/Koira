package koira.seuranta.liike;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.robotics.RegulatedMotor;

public class Movement {
	private EV3LargeRegulatedMotor rmotor;
	private EV3LargeRegulatedMotor lmotor;
	
	public Movement() {
		this.rmotor = new EV3LargeRegulatedMotor(MotorPort.A);
		this.lmotor = new EV3LargeRegulatedMotor(MotorPort.D);
		rmotor.synchronizeWith(new RegulatedMotor[] {this.lmotor});
	}
	
	public void forward() {
		this.rmotor.setSpeed(500);
		this.lmotor.setSpeed(500);
		this.rmotor.startSynchronization();
		this.rmotor.backward();
		this.lmotor.backward();
		this.rmotor.endSynchronization();
	}
	
	public void back() {
		this.rmotor.setSpeed(500);
		this.lmotor.setSpeed(500);
		this.rmotor.startSynchronization();
		this.rmotor.forward();
		this.lmotor.forward();
		this.rmotor.endSynchronization();
	}

	public void turn(float rspeed, float lspeed) {
		this.rmotor.setSpeed(rspeed);
		this.lmotor.setSpeed(lspeed);
		this.rmotor.startSynchronization();
		this.rmotor.forward();
		this.lmotor.forward();
		this.rmotor.endSynchronization();
	}

	public void stop() {
		this.rmotor.startSynchronization();
		this.rmotor.stop();
		this.lmotor.stop();
		this.rmotor.endSynchronization();
	}
}
