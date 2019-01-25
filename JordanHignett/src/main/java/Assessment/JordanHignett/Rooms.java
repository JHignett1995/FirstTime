package Assessment.JordanHignett;

public abstract class Rooms {
	public static Room[][] Swamp = new Room[10][10];
	public static int[] roomLocation = {0,0};
	public static int roomLocationX;
	public static int roomLocationY;
	public String roomDescription = "";
	public String roomContents = "";
	
	
	
	public int getRoomLocationX() {
		return roomLocationX;
	}

	public int getRoomLocationY() {
		return roomLocationY;
	}

	public static int[] getRoomLocation() {
		roomLocation[0] = roomLocationX;
		roomLocation[1] = roomLocationY;		
		
		return roomLocation;
	}

	public void setRoomLocation(int[] roomLocation) {
		for(int r = 0; r<10;r++) {
			roomLocation[0]= r+1;
			roomLocationX = r+1;
			for(int c=0; c<10;c++) {
				roomLocation[1] = c+1;
				roomLocationY = c+1;
			}
		}
		this.roomLocation = roomLocation;
	}

	public static Room[][] getSwamp() {
		return Swamp;
	}

	public static void setSwamp(Room[][] numberOfRooms) {
		
		for(int r =0; r <10 ;r++){
			for(int c =0; c<10; c++) {
				numberOfRooms[r][c] = new Room();
			}
		}
		
		Rooms.Swamp = numberOfRooms;
	}

	public String getRoomDescription() {
		return roomDescription;
	}

	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}

	public String getRoomContents() {
		return roomContents;
	}

	public void setRoomContents(String roomContents) {
		this.roomContents = roomContents;
	}
	
}
