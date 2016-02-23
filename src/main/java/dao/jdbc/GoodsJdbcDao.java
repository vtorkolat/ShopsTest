package dao.jdbc;

import dao.GoodsDao;
import exeptions.DuplicateGoodsExeptions;
import model.Goods;
import model.enumerations.Status;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GoodsJdbcDao extends AbstractJdbcDao implements GoodsDao {
    private static final String SQL_INSERT = "INSERT INTO goods (id, goods_title, price, status, category_id) VALUES (?,?,?,?,?)";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM shop_test.goods WHERE id = ?";
    private static final String SQL_UPDATE_BY_ID = "UPDATE goods SET id = ?,goods_title=?, price = ?, status=?, category_id=?";
    private static final String SQL_DELETE_BY_ID = "DELETE goods WHERE id = ?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM goods";


    @Override
    public void create(Goods good) throws DuplicateGoodsExeptions {
        init();
        PreparedStatement ps=null;
        try{ ps= getPreparedStatement(SQL_INSERT);
            ps.setInt(1, good.getId());
            ps.setString(2, good.getTitle());
            ps.setInt(3, good.getPrice());
            ps.setString(4, String.valueOf(good.getStatus()));
            ps.setInt(5, good.getCategoryId());

            int affectedRowsQua = ps.executeUpdate();
            System.out.println("Affected rows quantity: " + affectedRowsQua);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ps);
        }


    }

    @Override
    public Goods read(int id) {
        init();
        Goods good = new Goods();
        PreparedStatement ps=null;
        try { ps = getPreparedStatement(SQL_SELECT_BY_ID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
            good.setId(rs.getInt("id"));
            good.setTitle(rs.getString("goods_title"));
            good.setPrice(rs.getInt("price"));
            good.setStatus(Status.fromString(rs.getString("status")));
            good.setCategoryId(rs.getInt("category_id"));}
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ps);
        }
        return null;
    }

    @Override
    public void update(Goods good) {
        init();
        PreparedStatement ps = null;
        try {
            ps = getPreparedStatement(SQL_UPDATE_BY_ID);
            ps.setInt(1, good.getId());
            ps.setString(2, good.getTitle());
            ps.setInt(3, good.getPrice());
            ps.setString(4, String.valueOf(good.getStatus()));
            ps.setInt(5, good.getCategoryId());
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ps);
        }

    }

    @Override
    public void delete(int id) {
        init();
        PreparedStatement ps = null;
        try{ps = getPreparedStatement(SQL_DELETE_BY_ID);
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public List<Goods> getAll() {
        init();
        List<Goods> goods = new ArrayList<>();
        Statement statement = null;
        try {statement = getStatement();
            ResultSet rs = statement.executeQuery(SQL_SELECT_ALL);
            Goods good = new Goods();
            while (rs.next()){
                good.setId(rs.getInt(1));
                good.setTitle(rs.getString(2));
                good.setPrice(rs.getInt(3));
                good.setStatus(Status.fromString(rs.getString(4)));
                good.setCategoryId(rs.getInt(5));
            goods.add(good);}
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(statement);
        }
        return goods;
    }
}
