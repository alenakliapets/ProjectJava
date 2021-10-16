package Lesson8;

import java.util.ArrayList;
import java.util.Comparator;

public class Shop {
    public ArrayList <Product> list;

    public Shop(ArrayList<Product> list) {
        this.list = list;
    }

    public ArrayList<Product> getList() {
        return list;
    }

    public void setList(ArrayList<Product> list) {
        this.list = list;
    }

    public void addProduct(Product product){
        boolean isProductNew = true;
        for (int i = 0; i < list.size(); i++) {
            if (product.getId()==list.get(i).getId()) isProductNew = false;
        }
        if (isProductNew) list.add(product);
    }
    public ArrayList<Product> returnProducts (){
        return list;
    }
    public void deleteProduct(int id){
        for (int i = 0; i < list.size(); i++) {
            if (id==list.get(i).getId()) list.remove(i);
        }
    }
    public void editProduct (Product product){
        for (int i = 0; i < list.size(); i++) {
            if (product.getId()==list.get(i).getId()){
                list.get(i).setName(product.getName());
                list.get(i).setPrice(product.getPrice());
            }
        }
    }
    public ArrayList<Product> returnSortedByPrice(){
        ArrayList<Product> list2 = new ArrayList<>(list);
        list2.sort(new Comparator<Product>() {
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
        return list2;
    }
}
