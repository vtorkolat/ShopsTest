package model;

import model.enumerations.CategoryTitle;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private  int id;
    private CategoryTitle categoryTitle;
    private  int shopsId;
    private List<Goods> goods = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CategoryTitle getCategoryTitle() {
        return categoryTitle;
    }

    public void setCategoryTitle(CategoryTitle categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public int getShopsId() {
        return shopsId;
    }

    public void setShopsId(int shopsId) {
        this.shopsId = shopsId;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }
}
