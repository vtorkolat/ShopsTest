package threads;

import abstractFactory.Auchan;
import abstractFactory.ShopFactory;
import abstractFactory.impl.AuchanShopFactory;
import abstractFactory.impl.ShopCreator;

public class AuchanThread extends Thread {


    @Override
    public void run() {
        ShopCreator shopCreator = new AuchanShopFactory();
        ShopFactory shopFactory = shopCreator.createShop("Auchan");
        System.out.println(shopFactory.getShop());

        Auchan.changePrice();


        }


    }

