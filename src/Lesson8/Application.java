package Lesson8;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {

    public void start(){
        boolean work = true;
        while (work){
            System.out.println("Выберите действие:\n" +
                    "Вывод всех товаров - нажмите 1\n" +
                    "Добавление товара - нажмите 2\n" +
                    "Удаление товара - нажмите 3\n" +
                    "Редактирование товара - нажмите 4\n" +
                    "Выход - нажмите 5");
        Scanner scanner = new Scanner(System.in);
        int number=0;
       try { number = scanner.nextInt();}
       catch (InputMismatchException e){
          System.out.println("Введите число от 1 до 5");
       }
switch (number){
    case 1:
        System.out.println("Выберите действие:\n" +
                "Сортировка по цене (возрастание)- нажмите 1\n" +
                "Сортировка по цене (убывание) - нажмите 2\n" +
                "Сортировка по добавлению (сначала новые, потом старые) - нажмите 3\n");
        int number2=0;
        try { number2 = scanner.nextInt();}
        catch (InputMismatchException e){
            System.out.println("Введите число от 1 до 3");
        }
        switch (number2){
            case 1:
                ArrayList<Product> list2 = new ArrayList<Product>(Main2.myShop.returnSortedByPrice());
                for (int i = 0; i < list2.size(); i++) {
                    System.out.println(list2.get(i).getId()+"-"+list2.get(i).getName()+"-"+list2.get(i).getPrice());
                }
                break;
            case 2:
                ArrayList<Product> list3 = new ArrayList<Product>(Main2.myShop.returnSortedByPrice());
                for (int i = list3.size()-1; i >=0; i--) {
                    System.out.println(list3.get(i).getId()+"-"+list3.get(i).getName()+"-"+list3.get(i).getPrice());
                }
                break;
            case 3:
                ArrayList<Product> list4 = new ArrayList<Product>(Main2.myShop.returnProducts());
                for (int i = 0; i < list4.size(); i++) {
                    System.out.println(list4.get(i).getId()+"-"+list4.get(i).getName()+"-"+list4.get(i).getPrice());
                }
                break;
        }
        break;
    case 2:
        System.out.println("Введите id, название и цену товара каждый параметр с новой строки");
      int id = 0;
      String name = "";
      int price = 0;
        try{
            id = scanner.nextInt();
            name =scanner.next();
            price = scanner.nextInt();}
        catch (InputMismatchException e){
            System.out.println("Введите корректные данные");
        }
        Main2.myShop.addProduct(new Product(id, name, price));
        break;
    case 3:
        System.out.println("Введите id товара, который нужно удалить");
        int idDelete = 0;
        try{
            idDelete = scanner.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Введите корректные данные");
        }
        Main2.myShop.deleteProduct(idDelete);
        break;
    case 4:
        System.out.println("Введите id товара находящегося в списке, который следует отредактировать," +
                " новое название и новую цену товара каждый параметр с новой строки");
        int idEdit = 0;
        String nameEdit = "";
        int priceEdit = 0;
        try{
            idEdit = scanner.nextInt();
            nameEdit = scanner.next();
            priceEdit = scanner.nextInt();}
        catch (InputMismatchException e){
            System.out.println("Введите корректные данные");
        }
        Main2.myShop.editProduct(new Product(idEdit,nameEdit,priceEdit));
        break;
    case 5:
        work = false;
        break;
}
      }
    }
}
