package dao.jdbc;

import dao.ShopDao;
import exeptions.DuplicateShopExeptions;
import model.Shop;

import java.util.List;

public class ShopJdbcDao extends AbstractJdbcDao implements ShopDao {

    public void create(Shop shop) throws DuplicateShopExeptions {


    }

    public Shop read(int id) {
        return null;
    }

    public void update(Shop shop) {

    }

    public void delete(int id) {

    }

    public List<Shop> getAll() {
        return null;
    }
}
