package Assessment.JordanHignett;

/**
 * Hello world!
 *
 */
public class App 
{
	public static int[][] gameSize = new int[10][10];
    public static void main( String[] args )
    {
    
    }
    
    public static void initializeSwamp() {
    	
    	for(int r =0;r<Rooms.getSwamp().length;r++) {
    		for(int c =0;c<Rooms.getSwamp().length;c++) {
    			Room.Swamp[r][c].getAvailableDirections();
    			Room.Swamp[r][c].getEastLocation();
    			Room.Swamp[r][c].getNorthLocation();
    			Room.Swamp[r][c].getRoomContains();
    			Room.Swamp[r][c].getRoomDescription();
    		}
    	}
    }
    
    public static void test() {
        System.out.println( Players.getLocationX() + Players.locationY);
    }
}
