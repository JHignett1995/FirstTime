package Assessment.JordanHignett;

public class PlayerOne extends Players {
	String[] inventory = { "", "", "", "", "", "" };
	public int inventorySlots = inventory.length;
	private int invetorySlotsAvailable = 6;
	public boolean canPickUP;
	public boolean canDrop;

	public String getInventory(int i) {

		return inventory[i];
	}

	public void setInventory(String[] inventory) {

	}

	public int getInventorySlots() {
		return inventorySlots;
	}

	public void setInventorySlots(int inventorySlots) {
		this.inventorySlots = inventorySlots;
	}

	public int getInvetorySlotsAvailable() {
		return invetorySlotsAvailable;
	}

	public void setInvetorySlotsAvailable(int invetorySlotsAvailable) {
		this.invetorySlotsAvailable = invetorySlotsAvailable;
	}

	
	
	public String AvailableAction() {
		String Actions ="";
		
		Actions = Actions + Rooms.Swamp[PlayerOne.locationX][PlayerOne.locationY].getAvailableDirections() + "\n";
		if (getCanPickUP()) {
		Actions = Actions + "Can Pick up\n";}
		
		if(invetorySlotsAvailable < 6 && Rooms.Swamp[PlayerOne.locationX][PlayerOne.locationY].getRoomContains().isEmpty()) {
			Actions = Actions + "Can Drop\n";
		}
		
		return Actions;
	}

	public boolean getCanPickUP() {
		return canPickUP;
	}

	public void setCanPickUP(boolean canPickUP) {
		if (getInvetorySlotsAvailable() > 0 && Rooms.Swamp[PlayerOne.locationX][PlayerOne.locationY].getRoomContains().contentEquals("Gold") || Rooms.Swamp[PlayerOne.locationX][PlayerOne.locationY].getRoomContains().contentEquals("Golden Heart")) {
			canPickUP = true;
		} else {
			canPickUP = false;
		}
		this.canPickUP = canPickUP;
	}

	public boolean getCanDrop() {
		return canDrop;
	}

	public void setCanDrop(boolean canDrop) {
		if (Rooms.Swamp[PlayerOne.locationX][PlayerOne.locationY].getRoomContains().equals("Nothing")) {
			canDrop = true;
		} else {
			canDrop = false;
		}

		this.canDrop = canDrop;
	}

	public void pickUp() {
		for (int i = 0; i < inventory.length; i++) {
			if (getInventory(i).equals("")) {
				inventory[i] = Rooms.Swamp[PlayerOne.locationX][PlayerOne.locationY].getRoomContains();
				Rooms.Swamp[PlayerOne.locationX][PlayerOne.locationY].setRoomContains("Nothing");
			}
		}

	}

	public void Drop(int i) {
		if (getInventory(i).length() != 0) {
			Rooms.Swamp[PlayerOne.locationX][PlayerOne.locationY].setRoomContains(inventory[i]);
			inventory[i] = "";
		}
	}
}
