package abstractFactory;

public class Shop {
    private static Shop instance;

    private Shop() {}

    public static Shop getInstance() {
        if (instance == null) {
            instance = new Shop();
        }
        return instance;
    }

    public model.Shop getShop(String title) {
        return Shop.get(title);
    }
}
