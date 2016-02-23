package model;

import model.enumerations.CategoryTitle;

public class Category {
   private  int id;
   private CategoryTitle categoryTitle;
    private  int shopsId;

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
}
