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
	
	void forward() {
		this.rmotor.startSynchronization();
		this.rmotor.backward();
		this.lmotor.backward();
		this.rmotor.endSynchronization();
	}
	
	void back() {
		this.rmotor.startSynchronization();
		this.rmotor.forward();
		this.lmotor.forward();
		this.rmotor.endSynchronization();
	}

	void turn() {
		this.rmotor.startSynchronization();
		this.rmotor.endSynchronization();
	}

	void stop() {
		this.rmotor.startSynchronization();
		this.rmotor.stop();
		this.lmotor.stop();
		this.rmotor.endSynchronization();
	}
}
