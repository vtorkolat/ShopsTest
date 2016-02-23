package main;

import abstractFactory.ShopFactory;
import abstractFactory.create.BillaShopFactory;
import abstractFactory.create.ShopCreator;

public class Main {
    public static void main(String[] args) {
        ShopCreator shopCreator = new BillaShopFactory();

        ShopFactory shopFactory = shopCreator.createShop();
        shopFactory.getShop();

    }
}
