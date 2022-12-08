package Prhotel;

import java.io.Serializable;

public class Hotel implements Serializable {
    private int id;
    private int type;//1,2,3
    private int price;
    private String status;//tên khách

    public Hotel(int id, int type, int price, String s, String status) {
    }

    public Hotel(int id, int type, int price, String status) {
        this.id = id;
        this.type = type;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Hotel : " +
                " id = " + id +
                ", type = " + type +
                ", price = " + price +
                ", status = '" + status + '\'' +
                ':';
    }
}
