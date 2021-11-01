package Lesson2;

import java.util.Scanner;

public class Lesson2Homework {

    public static void main (String[] args){
        Lesson2Homework homework=new Lesson2Homework();
        taskSeven();
    }
   public static void taskTwo(){
       Scanner scanner=new Scanner(System.in);
       int ourNumber=Integer.parseInt(scanner.nextLine());
       int firstNum=ourNumber%10;
       int secNum=(ourNumber/10)%10;
       int thirdNum=(ourNumber/10/10)%10;
       int fourthNum=(ourNumber/10/10/10)%10;
       if ((firstNum!=secNum)&&(firstNum!=thirdNum)&&(firstNum!=fourthNum)&&(secNum!=thirdNum)&&(secNum!=fourthNum)&&(thirdNum!=fourthNum))
           System.out.println("Все цифры числа различны");
       else System.out.println("Не все цифры числа различны");
   }



    public static void taskThree(){
        Scanner scanner=new Scanner(System.in);
        int ourNumber2=Integer.parseInt(scanner.nextLine());
        if ((ourNumber2>=100)&&(ourNumber2<1000)) System.out.println("Число трехзначное");
        else System.out.println("Число не трехзначное");
        if (ourNumber2%10==7) System.out.println("Число оканчивается на 7");
        else System.out.println("Число не оканчивается на 7");
        if (ourNumber2%2==0) System.out.println("Число четное");
        else System.out.println("Число нечетное");
    }
    public static void taskFour(){
        Scanner scanner=new Scanner(System.in);
        int storonaA=Integer.parseInt(scanner.nextLine());
        int storonaB=Integer.parseInt(scanner.nextLine());
        int storonaC=Integer.parseInt(scanner.nextLine());
        if (((storonaA+storonaB)>storonaC)&&((storonaB+storonaC)>storonaA)&&(storonaA+storonaC)>storonaB)
            System.out.println("Треугольник существует");
        else System.out.println("Треугольник не существует");
    }
    public static void taskFive(){
        Scanner scanner=new Scanner(System.in);
        int ourNumber=Integer.parseInt(scanner.nextLine());
        if (ourNumber>0) ourNumber++;
        if (ourNumber<0) ourNumber-=2;
        if (ourNumber==0) ourNumber=10;
        System.out.println(ourNumber);
    }
    public static void taskSix(){
        Scanner scanner=new Scanner(System.in);
        int number1=Integer.parseInt(scanner.nextLine());
        int number2=Integer.parseInt(scanner.nextLine());
        if (number1>number2) System.out.println(number1);
        else System.out.println(number2);
    }
    public static void taskSeven() {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());;
        if ((number % 100 >= 11) && (number % 100 <= 14)) System.out.println(number + " программистов");
        else {
            if (number % 10 == 1) System.out.println(number + " программист");
            else {
                if ((number % 10 >= 2) && (number % 10 <= 4)) System.out.println(number + " программиста");
                else System.out.println(number + " программистов");
            }
        }
    }
}
