package dao.jdbc;

import dao.CategoryDao;
import model.Category;
import model.enumerations.CategoryTitle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoryJdbcDao extends AbstractJdbcDao implements CategoryDao {
    private static final String SQL_INSERT = "INSERT INTO category (id, category_title, shops_id) VALUES (?,?,?)";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM category WHERE id = ?";
    private static final String SQL_UPDATE_BY_ID = "UPDATE category SET id = ? , category_title=? , shops_id = ?";
    private static final String SQL_DELETE_BY_ID = "DELETE category WHERE id = ?";
    private static final String SQL_SELECT_ALL = "SELECT * FROM category";

    @Override
    public void create(Category category) {
        PreparedStatement ps = null;
        try {ps = getPreparedStatement(SQL_INSERT);
            ps.setInt(1, category.getId());
            ps.setString(2, String.valueOf(category.getCategoryTitle()));
            ps.setInt(3, category.getShopsId());

            int affectedRowsQua = ps.executeUpdate();
            System.out.println("Affected rows quantity " + affectedRowsQua);
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ps);
        }
    }

    @Override
    public Category read(int id) {
        Category category = new Category();
        PreparedStatement ps = null;
        try{ps = getPreparedStatement(SQL_SELECT_BY_ID);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                category.setId(rs.getInt("id"));
                category.setCategoryTitle(CategoryTitle.fromString(rs.getString("category_title")));
                category.setId(rs.getInt("shops_id"));
            }

        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ps);
        }
        return category;
    }

    @Override
    public void update(Category category) {
        PreparedStatement ps = null;
        try{ ps = getPreparedStatement(SQL_UPDATE_BY_ID);
            ps.setInt(1, category.getId());
            ps.setString(2, String.valueOf(category.getCategoryTitle()));
            ps.setInt(3, category.getShopsId());
            ps.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ps);
        }

    }

    @Override
    public void delete(int id) {
        PreparedStatement ps = null;
        try {ps = getPreparedStatement(SQL_DELETE_BY_ID);
            ps.setInt(1, id );
            ps.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(ps);
        }

    }

    @Override
    public List<Category> getAll() {
        List<Category> categories = new ArrayList<>();
        Statement statement = null;
        try{statement = getStatement();
            ResultSet rs = statement.executeQuery(SQL_SELECT_ALL);
            while (rs.next()){
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setCategoryTitle(CategoryTitle.fromString(rs.getString("category_title")));
                category.setId(rs.getInt("shops_id"));
                categories.add(category);
            }

        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeStatement(statement);
        }
        return categories;
    }
}
