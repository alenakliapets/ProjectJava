package Lesson8;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        Shop myShop = new Shop(list);

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

        ArrayList<Product> list2 = new ArrayList<>(myShop.returnProducts());
            list2.sort(new Comparator <Product>() {
                @Override
                public int compare(Product o1, Product o2) {
                    if (o1.getPrice() > o2.getPrice()) {
                        return 1;
                    } else if (o1.getPrice() < o2.getPrice()) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            });
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i).getId()+"-"+list2.get(i).getName()+"-"+list2.get(i).getPrice());
        }
        System.out.println("-----------");
        myShop.deleteProduct(30004);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId()+"-"+list.get(i).getName()+"-"+list.get(i).getPrice());
        }
        System.out.println("-----------");
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.println(list.get(i).getId()+"-"+list.get(i).getName()+"-"+list.get(i).getPrice());
        }
        System.out.println("-----------");
        myShop.editProduct(new Product(30005, "Still Water",4));
        ArrayList <Product> list3 = new ArrayList<>(myShop.returnProducts());
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i).getId()+"-"+list3.get(i).getName()+"-"+list3.get(i).getPrice());
        }
    }
}
