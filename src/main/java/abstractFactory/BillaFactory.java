package abstractFactory;

public class BillaFactory implements ShopFactory {
    private static final int id = 1;
    private static final String title = "Billa";

    @Override
    public String getShop() {
        return "Shop "+title + " with " + "id=" + id+" created";
    }
}