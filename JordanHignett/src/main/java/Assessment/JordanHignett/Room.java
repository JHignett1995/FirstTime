package Assessment.JordanHignett;

import java.util.Random;

public class Room extends Rooms {
	public boolean isNorthAvailable;
	public boolean isEastAvailable;
	public boolean isSouthAvailable;
	public boolean isWestAvailable;
	public int[] northLocation = { 0, 0 };
	public int[] eastLocation = { 0, 0 };
	public int[] southLocation = { 0, 0 };
	public int[] westLocation = { 0, 0 };
	int[] Location = Rooms.getRoomLocation();
	String availableDirections;
	String roomContains = "";
	
	public boolean isNorthAvailable() {

		if (Location[0] == 1) {
			isNorthAvailable = false;
		} else {
			isNorthAvailable = true;
		}

		return isNorthAvailable;
	}

	public void setNorthAvailable() {

		this.isNorthAvailable = isNorthAvailable();
	}

	public boolean isEastAvailable() {

		if (Location[1] == 10) {
			isEastAvailable = false;
		} else {
			isEastAvailable = true;
		}
		return isEastAvailable;
	}

	public void setEastAvailable() {
		this.isEastAvailable = isEastAvailable();
	}

	public boolean isSouthAvailable() {

		if (Location[0] == 10) {
			isSouthAvailable = false;
		} else {
			isSouthAvailable = true;
		}

		return isSouthAvailable;
	}

	public void setSouthAvailable() {
		this.isSouthAvailable = isSouthAvailable();
	}

	public boolean isWestAvailable() {

		if (Location[0] == 1) {
			isWestAvailable = false;
		} else {
			isWestAvailable = true;
		}

		return isWestAvailable;
	}

	public void setWestAvailable() {
		this.isWestAvailable = isWestAvailable();
	}

	public int[] getNorthLocation() {
		return northLocation;
	}

	public void setNorthLocation(int[] northLocation) {
		northLocation[0] = Location[0] - 1;
		northLocation[1] = Location[1];
		this.northLocation = northLocation;
	}

	public int[] getEastLocation() {
		return eastLocation;
	}

	public void setEastLocation(int[] eastLocation) {
		eastLocation[0] = Location[0];
		eastLocation[1] = Location[1] + 1;
		this.eastLocation = eastLocation;
	}

	public int[] getSouthLocation() {
		return southLocation;
	}

	public void setSouthLocation(int[] southLocation) {
		southLocation[0] = Location[0] + 1;
		southLocation[1] = Location[1];
		this.southLocation = southLocation;
	}

	public int[] getWestLocation() {
		return westLocation;
	}

	public void setWestLocation(int[] westLocation) {
		westLocation[0] = Location[0];
		westLocation[1] = Location[1] - 1;
		this.westLocation = westLocation;
	}

	public String getAvailableDirections() {
		String Temp = "Available Directions are: ";

		if (isNorthAvailable) {
			Temp = Temp + "North, ";
		}

		if (isEastAvailable) {
			Temp = Temp + "East, ";
		}

		if (isSouthAvailable) {
			Temp = Temp + "South, ";
		}

		if (isEastAvailable) {
			Temp = Temp + "West.\n";
		}
		this.availableDirections = Temp;

		return availableDirections;

	}

	public void setAvailableDirections(String availableDirections) {
		this.availableDirections = getAvailableDirections();
	}

	public String getRoomContains() {
		return roomContains;
	}

	public void setRoomContains(String roomContains) {
		
		
		this.roomContains = roomContains;
	}

}
