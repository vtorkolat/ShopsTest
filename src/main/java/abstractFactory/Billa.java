package abstractFactory;

import dao.jdbc.GoodsJdbcDao;

public class Billa {
    private static Billa instance;

    private Billa() {
    }

    public static Billa getInstance() {
        if (instance == null) {
            synchronized (Billa.class) {
                if (instance == null) {
                    instance = new Billa();
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
