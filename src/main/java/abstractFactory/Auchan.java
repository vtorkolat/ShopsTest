package abstractFactory;

import dao.jdbc.GoodsJdbcDao;

public class Auchan {
    private static Auchan instance;


    private Auchan() {
    }

    public static Auchan getInstance() {
        if (instance == null) {
            synchronized (Auchan.class) {
                if (instance == null) {
                    instance = new Auchan();
                }
            }
        }
        return instance;
    }

    public static void changePrice (){
        GoodsJdbcDao goodsPrice = new GoodsJdbcDao();
        goodsPrice.changePrices();
    }


}