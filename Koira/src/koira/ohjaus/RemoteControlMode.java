package koira.ohjaus;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3IRSensor;
import lejos.robotics.RegulatedMotor;

public class RemoteControlMode {

	public static void main(String[] args){
		RegulatedMotor mA = new EV3LargeRegulatedMotor(MotorPort.A);
		RegulatedMotor mD = new EV3LargeRegulatedMotor(MotorPort.D);
		EV3IRSensor irSensor = new EV3IRSensor(SensorPort.S1);
		RemoteControlMotor remote = new RemoteControlMotor(irSensor,mA,mD);
		remote.start();
	}
}
