package dao;

import exeptions.DuplicateShopExeptions;
import model.Shop;

import java.util.List;

public interface ShopDao {
    void create(Shop shop) throws DuplicateShopExeptions;
    Shop read(int id);
    void update(Shop shop);
    void delete(int id);
    List<Shop> getAll();

}
