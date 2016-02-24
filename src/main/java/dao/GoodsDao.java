package dao;

import exeptions.DuplicateGoodsExeptions;
import model.Goods;

import java.util.List;

public interface GoodsDao {

    void create(Goods good) throws DuplicateGoodsExeptions;
    Goods read(int id);
    void update(Goods good);
    void delete(int id);
    List<Goods> getAll();
    void changePrices();
}