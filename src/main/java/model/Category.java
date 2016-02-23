package model;

import model.enumerations.CategoryTitle;

public class Category {
   private  int id;
   private CategoryTitle categoryTitle;

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
}
