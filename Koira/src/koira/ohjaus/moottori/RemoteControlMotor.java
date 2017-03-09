package koira.ohjaus.moottori;

import lejos.hardware.Button;
import lejos.hardware.sensor.EV3IRSensor;
import lejos.robotics.RegulatedMotor;

public class RemoteControlMotor extends Thread {
	private RegulatedMotor rmotor;
	private RegulatedMotor lmotor;
	private EV3IRSensor infraredSensor;
	
	public RemoteControlMotor(EV3IRSensor sensor, RegulatedMotor rmotor,RegulatedMotor lmotor) {
		this.infraredSensor = sensor;
		this.rmotor = rmotor;
		this.lmotor = lmotor;
		this.rmotor.synchronizeWith(new RegulatedMotor[] {this.lmotor});
		}
	
	public void run() {
		while (!Button.ESCAPE.isDown()) {
			int remoteCommand = infraredSensor.getRemoteCommand(0);
			
			if(remoteCommand == 1){
				forward();
			} else if(remoteCommand == 2){
				back();
			} else if(remoteCommand == 3){
				right();
			} else if(remoteCommand == 4){
				left();
			} else if(remoteCommand == 0){
				stopMotor();
			}
		}
	}

	public void back() {
		this.rmotor.startSynchronization();
		this.rmotor.forward();
		this.lmotor.forward();
		this.rmotor.endSynchronization();
	}

	public void forward(){
		this.rmotor.startSynchronization();
		this.rmotor.backward();
		this.lmotor.backward();
		this.rmotor.endSynchronization();
	}

	public void left(){
		this.rmotor.startSynchronization();
		this.rmotor.forward();
		this.lmotor.backward();
		this.rmotor.endSynchronization();
	}

	public void right(){
		this.rmotor.startSynchronization();
		this.rmotor.backward();
		this.lmotor.forward();
		this.rmotor.endSynchronization();
	}

	public void stopMotor(){
		this.rmotor.startSynchronization();
		this.rmotor.stop();
		this.lmotor.stop();
		this.rmotor.endSynchronization();
	}
}
