package abstractFactory.create;

import abstractFactory.Billa;
import abstractFactory.ShopFactory;

public class BillaShopFactory implements ShopCreator {
    @Override
    public ShopFactory createShop() {
        return new Billa();
    }
}
