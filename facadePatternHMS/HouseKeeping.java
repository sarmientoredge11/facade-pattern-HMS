package facadePatternHMS;

public class HouseKeeping implements HotelService {

    public void cleanRoom(int roomNumber) {
        System.out.println("HouseKeeping: Cleaning room " + roomNumber + ".");
    }
}
