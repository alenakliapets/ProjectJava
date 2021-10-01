package Lesson6.MyHuman;

import Lesson6.MyHuman.Jacket.DolceGabbanaJacket;
import Lesson6.MyHuman.Jacket.GucciJacket;
import Lesson6.MyHuman.Jacket.VersaceJacket;
import Lesson6.MyHuman.Pants.DolceGabbanaPants;
import Lesson6.MyHuman.Pants.GucciPants;
import Lesson6.MyHuman.Pants.VersacePants;
import Lesson6.MyHuman.Shoes.DolceGabbanaShoes;
import Lesson6.MyHuman.Shoes.GucciShoes;
import Lesson6.MyHuman.Shoes.VersaceShoes;

public class Run {
    public static void main(String[] args) {
        Human firstHuman = new Human("Иван", new DolceGabbanaJacket(100),
                new VersacePants(150),new GucciShoes(200));
        Human secondHuman = new Human("Василий", new VersaceJacket(100),
                new GucciPants(150),new DolceGabbanaShoes(250));
        Human thirdHuman = new Human("Сергей", new GucciJacket(200),
                new DolceGabbanaPants(300), new VersaceShoes(300));
        System.out.println(firstHuman.getName());
        firstHuman.putOn();
        System.out.println(secondHuman.getName());
        secondHuman.putOn();
        System.out.println(thirdHuman.getName());
        thirdHuman.putOn();
        System.out.println();
        int first=firstHuman.getPrice();
        int second=secondHuman.getPrice();
        int third=thirdHuman.getPrice();
        if ((first==second)&&(second==third)) System.out.println("Цены на все три наряда одинаковые");
        else {
            if ((first==second)&&(first>third)) System.out.println("Первый и второй наряды самые дорогие");
            else {
                if ((second==third)&&(second>first)) System.out.println("Второй и третий наряды самые дорогие");
                else {
                    if ((first==third)&&(third>second)) System.out.println("Первый и третий наряды самые дорогие");
                    else {
                        if ((first>second)&&(first>third))System.out.println("Первый наряд самый дорогой");
                        else {
                            if ((second>first)&&(second>third))System.out.println("Второй наряд самый дорогой");
                            else System.out.println("Третий наряд самый дорогой");
                        }
                    }
                }
            }
        }
    }
}
