package service;

import model.Shop;

import java.util.HashMap;
import java.util.Map;

public class AbstractShops {
    private static AbstractShops instance;
    private Map<String, Shop> shops = new HashMap<>();

    {
        shops.put("Furshet", new Shop(1, "Furshet"));
        shops.put("Billa", new Shop(2, "Billa"));
    }

    private AbstractShops() {}

    public static AbstractShops getInstance() {
        if (instance == null) {
            instance = new AbstractShops();
        }
        return instance;
    }

    public Shop getShop(String title) {
        return shops.get(title);
    }
}
