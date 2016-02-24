package abstractFactory.impl;

import abstractFactory.AuchanFactory;
import abstractFactory.ShopFactory;

public class AuchanShopFactory implements ShopCreator {

    @Override
    public ShopFactory createShop(String title) {
        if("Auchan".equals(title)){
            return new AuchanFactory();
        }
        return null;
    }
}
