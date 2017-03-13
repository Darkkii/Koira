package koira.varoitus;

import java.io.File;

import lejos.hardware.Sound;

public class Alarm {
	private File haukku;
	
	public Alarm() {
		this.haukku = new File("haukku.wav");
	}

	public void alarm() {
		Sound.playSample(this.haukku);
	}

}
