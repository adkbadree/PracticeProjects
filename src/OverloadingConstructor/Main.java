package OverloadingConstructor;

public class Main {
    public static void main(String[] args) {

        Pizza pizza = new Pizza(14, "Thin Crust", 15.50, "Veggi", true);

        System.out.println(pizza.bread);
        System.out.println(pizza.size);
        System.out.println(pizza.price);
        System.out.println(pizza.topping);
        System.out.println(pizza.isOnSale);
        System.out.println();

        Pizza pizza1 = new Pizza(124, "Thick Crust", 120, "Chicken");

        System.out.println(pizza1.bread);
        System.out.println(pizza1.size);
        System.out.println(pizza1.price);
        System.out.println(pizza1.topping);



    }
}
