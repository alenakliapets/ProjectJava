package Lesson6.MyRobot;

import Lesson6.MyRobot.hands.SamsungHands;
import Lesson6.MyRobot.hands.SonyHands;
import Lesson6.MyRobot.hands.ToshibaHands;
import Lesson6.MyRobot.heads.SamsungHead;
import Lesson6.MyRobot.heads.SonyHead;
import Lesson6.MyRobot.heads.ToshibaHead;
import Lesson6.MyRobot.legs.SamsungLegs;
import Lesson6.MyRobot.legs.SonyLegs;
import Lesson6.MyRobot.legs.ToshibaLegs;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
Robot firstRobot = new Robot(new SonyHead(1000),new SamsungHands(200),new ToshibaLegs(300));
Robot secondRobot = new Robot(new SamsungHead(200), new ToshibaHands(250),new SonyLegs(300));
Robot thirdRobot = new Robot(new ToshibaHead(500),new SonyHands(500), new SamsungLegs(500));
        firstRobot.action();
        System.out.println();
        secondRobot.action();
        System.out.println();
        thirdRobot.action();
        System.out.println();
        int first=firstRobot.getPrice();
        int second=secondRobot.getPrice();
        int third=thirdRobot.getPrice();
        if ((first==second)&&(second==third)) System.out.println("Цены на все три робота одинаковые");
        else {
            if ((first==second)&&(first>third)) System.out.println("Первый и второй роботы самые дорогие");
            else {
                if ((second==third)&&(second>first)) System.out.println("Второй и третий роботы самые дорогие");
            else {
                if ((first==third)&&(third>second)) System.out.println("Первый и третий роботы самые дорогие");
                else {
                    if ((first>second)&&(first>third))System.out.println("Первый робот самый дорогой");
                    else {
                        if ((second>first)&&(second>third))System.out.println("Второй робот самый дорогой");
                        else System.out.println("Третий робот самый дорогой");
                    }
                }
                }
            }
        }
    }
}
