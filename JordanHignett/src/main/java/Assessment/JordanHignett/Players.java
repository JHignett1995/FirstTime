package Assessment.JordanHignett;

public abstract class Players {
	String adventurerName;
	
	public static int[] location = { 13, 13 };
	public static int locationY;
	public static int locationX;
	private int[] startLocation = { 13, 13 };

	public String getAdventurer() {
		return adventurerName;
	}

	public void setAdventurerName(String adventurerName) {
		this.adventurerName = adventurerName;
	}

	public String getAdventurerName() {
		return adventurerName;
	}

	public int[] getStartLocation() {
		return startLocation;
	}

	public void setStartLocation(int[] startLocation) {
		this.startLocation = startLocation;
	}

	public int UpdateAvailableInventorySlots() {
		int emptySlotCount = 0;
		for (int i = 0; i < inventorySlots; i++) {
			if (inventory[i].equals("")) {
				emptySlotCount++;
			}
		}
		return emptySlotCount;
	};

	public static int[] getLocation() {
		return location;
	}

	public static void setLocation(int[] location) {
		location[0] = getLocationX();
		location[1] = getLocationY();
		Players.location = location;
	}

	public static int getLocationY() {
		return locationY;
	}

	public static void setLocationY(int locationY) {
		Players.locationY = locationY;
	}

	public static int getLocationX() {
		return locationX;
	}

	public static void setLocationX(int locationX) {
		Players.locationX = locationX;
	}
}
