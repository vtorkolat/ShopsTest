package model;

import model.enumerations.Status;

public class Goods {
    private int price;
    private String title;
    private Status status;

    public Goods(){}

    public Goods(int price, String title, Status status) {
        this.price = price;
        this.title = title;
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
