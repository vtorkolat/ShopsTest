package abstractFactory.impl;

import abstractFactory.BillaFactory;
import abstractFactory.ShopFactory;

public class BillaShopFactory implements ShopCreator {

    @Override
    public ShopFactory createShop(String title) {
        if ("Billa".equals(title)){
        return new BillaFactory(); }
        return null;
    }
}
