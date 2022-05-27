package OverloadingConstructor;

public class Pizza {

    int size;
    String bread;
    double price;
    String topping;
    boolean isOnSale;

    Pizza(int size, String bread, double price, String topping, boolean isOnSale){
        this.size=size;
        this.bread=bread;
        this.price=price;
        this.topping=topping;
        this.isOnSale=isOnSale;


    }
    Pizza(int size, String bread, double price, String topping) {
        this.size = size;
        this.bread = bread;
        this.price = price;
        this.topping = topping;
    }

}
