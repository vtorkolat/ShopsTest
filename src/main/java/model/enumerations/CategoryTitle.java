package model.enumerations;

public enum CategoryTitle {
    WEAR ("wear"),
    DRINKS("drinks"),
    ALCOHOL ("alkohol"),
    FOOD ("food");

    protected String categoryTitle;

    CategoryTitle(String categoryTitle){
        this.categoryTitle=categoryTitle;
    }

    public static CategoryTitle fromString(String categoryTitle) {
        for (CategoryTitle condition : CategoryTitle.values()) {
            if (condition.categoryTitle.equalsIgnoreCase(categoryTitle)) return condition;
        }
        return FOOD;
    }

    public String toString() {
        return categoryTitle;
    }
}
