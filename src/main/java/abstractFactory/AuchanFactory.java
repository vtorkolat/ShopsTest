package abstractFactory;



public class AuchanFactory implements ShopFactory {
    private static final int id =2;
    private static final String title = "Auchan";

    @Override
    public String getShop() {

        return "Shop "+title+" with "+ "id="+id+" created";
    }
}