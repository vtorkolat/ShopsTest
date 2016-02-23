package abstractFactory.create;

import abstractFactory.Auchan;
import abstractFactory.ShopFactory;

public class AuchanShopFactory implements ShopCreator {
    @Override
    public ShopFactory createShop() {
        return new Auchan();
    }
}
