package koira.menu;

import Moodit.*;
import koira.Koira;
import lejos.hardware.Button;

public class Menu extends Koira{
	private Screen screen;
	protected int select;
	
	public Menu() {
		this.screen = new Screen();
		this.select = 0;

		while (true) {
			int button = Button.waitForAnyPress();
			if(button == Button.ID_DOWN) {
				if(this.select >= 2) {
					this.select = 0;
				} else {
					this.select += 1;
				}
				this.screen.moveSelector();
				
			} else if(button == Button.ID_UP) {
				if(this.select <= 0) {
					this.select = 2;
				} else {
					this.select -= 1;
				}
				this.screen.moveSelector();
				
			} else if(button == Button.ID_ENTER) {
				switch (this.select) {
			        case 1:  new FollowMode();
			                 break;
			        case 2:  new RemoteControlMode();
			                 break;
			        case 3:  new AlarmMode();
			                 break;
				}
			}
		}
	}
}
