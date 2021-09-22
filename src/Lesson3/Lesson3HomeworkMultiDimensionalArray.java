package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3HomeworkMultiDimensionalArray {
    public static void main(String[] args) {
        Lesson3HomeworkMultiDimensionalArray lesson3=new Lesson3HomeworkMultiDimensionalArray();
        //lesson3.taskOne();
        //lesson3.taskTwo();
        //lesson3.taskThree();
        //lesson3.taskFour();
        lesson3.taskFive();
    }
    public  void taskOne(){
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int[][]array=new int[number][number];
        Random random=new Random();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                array[i][j]=random.nextInt(51);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        int sum=0;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if ((i==j)&&(array[i][j]%2==0)) sum+=array[i][j];
            }
        }
        System.out.println(sum);
    }
    public  void taskTwo(){
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        int[][]array=new int[number][number];
        Random random=new Random();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                array[i][j]=random.nextInt(51);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                if (array[i][j] % 2 == 1) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
    }
    public  void taskThree() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[][] array = new int[number][number];
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                array[i][j] = random.nextInt(51);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int mult1=1;
        int mult2=1;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i==j) mult1*=array[i][j];
            }
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if (i==number-j-1) mult2*=array[i][j];
            }
        }
        if (mult1>mult2) System.out.println("Произведение элементов главной диагонали больше");
        else {
            if (mult1<mult2) System.out.println("Произведение элементов побочной диагонали больше");
            else System.out.println("Произведения элементов главной и побочной диагоналей равны");
        }
    }
    public  void taskFour() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[][] array = new int[number][number];
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                array[i][j] = random.nextInt(51);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
int sum=0;
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number-i-1; j++) {
                if (array[i][j]%2==0) sum+=array[i][j];
            }
        }
        System.out.println(sum);
    }
    public  void taskFive() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[][] array = new int[number][number];
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                array[i][j] = random.nextInt(51);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < number; i++) {
            for (int j = i+1; j < number; j++) {
                int temp=array[i][j];
                array[i][j]=array[j][i];
                array[j][i]=temp;
            }
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
