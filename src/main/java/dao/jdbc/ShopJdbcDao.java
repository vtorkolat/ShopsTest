package dao.jdbc;

import dao.ShopDao;
import exeptions.DuplicateShopExeptions;
import model.Shop;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class ShopJdbcDao extends AbstractJdbcDao implements ShopDao {
    private static final String SQL_INSERT = "INSERT INTO shops (id, shop_title) VALUES (?,?)";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM shops WHERE id = ?";
    private static final String SQL_UPDATE_BY_ID = "UPDATE shops SET id = ?,shop_title=?";
    private static final String SQL_DELETE_BY_ID = "DELETE shops WHERE id = ?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM shops";
    private static final String DUPLICATE_USER_MSG = "User with name {0} already exists";

    @Override
    public void create(Shop shop) throws DuplicateShopExeptions {
        init();
        PreparedStatement ps = null;
        try {
            ps = getPreparedStatement(SQL_INSERT);
            ps.setInt(1, shop.getId());
            ps.setString(2, shop.getTitle());

            int affectedRowsQua = ps.executeUpdate();
            System.out.println("Affected rows quantity " + affectedRowsQua);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DuplicateShopExeptions(MessageFormat.format(DUPLICATE_USER_MSG, shop.getTitle()), e);
        } finally {
            closeStatement(ps);
        }

    }

    @Override
    public Shop read(int id) {
        init();
        Shop shop = null;
        PreparedStatement ps = null;
        try {
            ps = getPreparedStatement(SQL_SELECT_BY_ID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                shop.setId(rs.getInt(1));
                shop.setTitle(rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ps);
        }
        return shop;
    }

    @Override
    public void update(Shop shop) {
        init();
        PreparedStatement ps = null;
        try {
            ps = getPreparedStatement(SQL_UPDATE_BY_ID);
            ps.setInt(1, shop.getId());
            ps.setString(2, shop.getTitle());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public void delete(int id) {
        init();
        PreparedStatement ps = null;
        try {
            ps = getPreparedStatement(SQL_DELETE_BY_ID);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ps);
        }

    }

    @Override
    public List<Shop> getAll() {
        init();
        List<Shop> shops = new ArrayList<>();
        Statement statement = null;

        try {
            statement = getStatement();
            ResultSet rs = statement.executeQuery(SQL_SELECT_ALL);
            Shop shop = new Shop();
            while (rs.next()) {
                shop.setId(rs.getInt(1));
                shop.setTitle(rs.getString(2));
                shops.add(shop);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(statement);
        }
        return shops;
    }
}
