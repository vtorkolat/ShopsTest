package threads;

import abstractFactory.Billa;
import abstractFactory.ShopFactory;
import abstractFactory.impl.BillaShopFactory;
import abstractFactory.impl.ShopCreator;

public class BillaThread extends Thread {

    @Override
    public  void run() {
        ShopCreator shopCreator = new BillaShopFactory();
        ShopFactory shopFactory = shopCreator.createShop("Billa");
        System.out.println(shopFactory.getShop());

        Billa.changePrice();

    }


}
