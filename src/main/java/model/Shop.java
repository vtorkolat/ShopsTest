package model;

import java.util.ArrayList;
import java.util.List;

public class Shop   {
    private int id;
    private String title;
    private List<Category> categories = new ArrayList<>();

    public Shop(){}

    public Shop(int id, String title) {
        this.id = id;
        this.title = title;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public String toString() {
        return this.title ;
    }
}
