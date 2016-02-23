package dao.jdbc;

import dao.CategoryDao;
import model.Category;

import java.util.List;

public class CategoryJdbcDao extends AbstractJdbcDao implements CategoryDao {


    @Override
    public void create(Category category) {

    }

    @Override
    public Category read(int id) {
        return null;
    }

    @Override
    public void update(Category category) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Category> getAll() {
        return null;
    }
}
