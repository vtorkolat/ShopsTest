package dao.jdbc;

import model.Shop;

import java.util.HashMap;
import java.util.Map;

public class ShopsDao {
    private static ShopsDao instance;
    private Map<Integer, Shop> shops = new HashMap<>();

    {
        shops.put("Furshet", new Shop(1, "Furshet"));
        shops.put("Billa", new Shop(2, "Billa"));
    }

    private ShopsDao() {}

    public static ShopsDao getInstance() {
        if (instance == null) {
            instance = new ShopsDao();
        }
        return instance;
    }

    public Shop getShop(String title) {
        return shops.get(title);
    }
}
