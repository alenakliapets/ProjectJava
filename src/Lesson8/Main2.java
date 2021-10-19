package Lesson8;

import java.util.ArrayList;

public class Main2 {
    public static Shop myShop;

    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        myShop = new Shop(list);

        Product firstProduct = new Product(30001, "Milk",2);
        Product secondProduct = new Product(30002, "Meat",5);
        Product thirdProduct = new Product(30003, "Chocolate",3);
        Product fourProduct = new Product(30004, "Cookies",10);
        Product fifthProduct = new Product(30005, "Water",1);

        myShop.addProduct(firstProduct);
        myShop.addProduct(secondProduct);
        myShop.addProduct(thirdProduct);
        myShop.addProduct(fourProduct);
        myShop.addProduct(fifthProduct);

        Application myApplication = new Application();
        myApplication.start();
    }
}
