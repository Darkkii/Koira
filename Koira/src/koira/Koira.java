package koira;

import koira.menu.Menu;
import koira.moottori.Movement;
import koira.sensori.Sensor;

public class Koira {
	protected Sensor sensor;
	protected Movement motor;
	
	public Koira() {
		this.sensor = new Sensor();
		this.motor = new Movement();
		sensor.start();
		Menu menu = new Menu();
	}
}
