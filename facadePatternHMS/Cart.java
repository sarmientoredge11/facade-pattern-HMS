package facadePatternHMS;

public class Cart implements HotelService {

    public void requestCart(int numberOfCarts) {
        System.out.println("Cart: Providing " + numberOfCarts + " luggage cart(s).");
    }
}
