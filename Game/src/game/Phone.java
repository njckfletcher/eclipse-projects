package game;

public class Phone {
	String tip = "";
	boolean on;
	boolean lock;
	boolean screenOn;
	int password = 4816;
	int itemWeight = 1;
	int battery = 0; // percent
	Button lockButton = new Button();
	
	public Phone() {
		if(battery == 0) {
			on = false;
		}
		while(battery > 0) {
			if(screenOn == false) {
				if(lockButton.pressed == true) {
					screenOn = true;
				}
			}
			else {
				if(lockButton.pressed == true) {
					screenOn = false;
				}
			}
			
		}
	}
}


//TIP: You just picked up an item.  You have an inventory and each item has a weight.  Your default maximum equipment load is 15.  
//Each item has different actions.  At any time, you can view the actions of an item by entering '(item name)' + 'description'.