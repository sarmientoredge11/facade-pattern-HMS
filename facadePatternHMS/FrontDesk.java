package facadePatternHMS;

public class FrontDesk {

    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;

    public FrontDesk() {
        valet = new Valet();
        houseKeeping = new HouseKeeping();
        cart = new Cart();
    }

    public void requestValet(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }

    public void requestRoomCleaning(int roomNumber) {
        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestLuggageCart(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
    }
}