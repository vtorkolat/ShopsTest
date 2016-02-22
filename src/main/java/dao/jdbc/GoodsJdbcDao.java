package dao.jdbc;

import dao.GoodsDao;
import exeptions.DuplicateGoodsExeptions;
import model.Goods;

import java.util.List;

public class GoodsJdbcDao extends AbstractJdbcDao implements GoodsDao {

    public void create(Goods good) throws DuplicateGoodsExeptions {

    }

    public Goods read(int id) {
        return null;
    }

    public void update(Goods good) {

    }

    public void delete(int id) {

    }

    public List<Goods> getAll() {
        return null;
    }
}
