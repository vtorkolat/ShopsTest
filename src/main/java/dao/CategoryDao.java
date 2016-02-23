package dao;

import model.Category;

import java.util.List;

public interface CategoryDao {
    void create(Category category);
    Category read(int id);
    void update(Category category);
    void delete(int id);
    List<Category> getAll();
}
