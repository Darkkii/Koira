package koira.menu;

import lejos.hardware.lcd.LCD;

public class Screen extends Menu {
	private String follow = "Follow Mode";
	private String remote = "Remote Mode";
	private String alarm = "Alarm Mode";
	private char selector = '>';
	
	public Screen() {
		LCD.clearDisplay();
		LCD.drawChar(selector, select, 0);
		LCD.drawString(follow, 2, 0);
		LCD.drawString(remote, 2, 1);
		LCD.drawString(alarm, 2, 2);
	}
	
	public void moveSelector() {
		LCD.clearDisplay();
		LCD.drawChar(selector, select, 0);
		LCD.drawString(follow, 2, 0);
		LCD.drawString(remote, 2, 1);
		LCD.drawString(alarm, 2, 2);
	}
}
