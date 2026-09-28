package facadePatternHMS;

public class HotelApp {

    public static void main(String[] args) {

        FrontDesk frontDesk = new FrontDesk();

        frontDesk.requestValet("ABC 1234");
        frontDesk.requestRoomCleaning(101);
        frontDesk.requestLuggageCart(2);
    }
}
