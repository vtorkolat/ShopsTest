package abstractFactory;

import model.Shop;

import java.util.HashMap;
import java.util.Map;

public class AbstractShop {
    private static AbstractShop instance;
    private Map<String, Shop> shops = new HashMap<>();

    {
        shops.put("Furshet", new Shop(1, "Furshet"));
        shops.put("Billa", new Shop(2, "Billa"));
    }
    private AbstractShop() {}

    public static AbstractShop getInstance() {
        if (instance == null) {
            synchronized (AbstractShop.class) {
                if (instance == null) {
                    instance = new AbstractShop();
                }
            }
        }
        return instance;
    }

    public model.Shop getShop(String title) {
        return shops.get(title);
    }


}
