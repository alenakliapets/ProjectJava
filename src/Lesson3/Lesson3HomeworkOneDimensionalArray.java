package Lesson3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lesson3HomeworkOneDimensionalArray {
    public static void main(String[] args) {
Lesson3HomeworkOneDimensionalArray lesson3=new Lesson3HomeworkOneDimensionalArray();
//lesson3.taskOne();
//lesson3.taskTwo();
//lesson3.taskThree();
//lesson3.taskFour();
//lesson3.taskFive();
//lesson3.taskSix();
//lesson3.taskSeven();
//lesson3.taskEight();
lesson3.taskNine();
    }
    public  void taskOne(){//В лекции преподаватель пояснил, что массив со значениями от 2 до 20 включая 20
int[] array=new int[10];
int number=2;
        for (int i = 0; i < array.length; i++) {
            array[i]=number;
            number+=2;
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public  void taskTwo(){
       int [] array=new int[50];
       int number=1;
        for (int i = 0; i < array.length; i++) {
            array[i]=number;
            number+=2;
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.print(array[i]+" ");
        }
    }
    public  void taskThree(){
        int[] array=new int[15];
        int count=0;
        Random random=new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);//в задаче указан диапазон чисел 0-99, в лекции было сказано, что надо включать число 99, поэтому в рандом записано число 100
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0) count++;
        }
        System.out.println();
            System.out.println(count);
    }
    public  void taskFour() {
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(21);//в задаче указан диапазон чисел 0-20, в лекции было сказано, что надо включать число 20, поэтому в рандом записано число 21
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++){
            if(i%2==1) array[i]=0;
            System.out.print(array[i] + " ");
        }
    }
    public  void taskFive(){
        Random random = new Random();
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(16);//в задаче указан диапазон чисел 0-15, в лекции было сказано, что надо включать число 15, поэтому в рандом записано число 16
            array2[i] = random.nextInt(16);
            sum1+=array1[i];
            sum2+=array2[i];
            System.out.print(array1[i] + " ");
         }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();
        double srednee1=(double) sum1/array1.length;
        double srednee2=(double) sum2/array2.length;
       if (srednee1>srednee2) System.out.println("Среднее арифметическое эмлементов первого массива больше");
       else  {
           if (srednee2>srednee1) System.out.println("Среднее арифметическое эмлементов второго массива больше");
       else System.out.println("Средние арифметические элементов обоих массивов равны");
       }
    }
    public  void taskSix(){
        Random random = new Random();
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);//в задаче указан диапазон чисел 0-10, в лекции было сказано, что надо включать число 10, поэтому в рандом записано число 11
            System.out.print(array[i] + " ");
        }
        int count=0;
        for (int i = 0; i <array.length-1 ; i++) {
            if (array[i]<array[i+1]) count++;
        }
        System.out.println();
        if (count==3) System.out.println("Данный массив является строго возрастающей последовательностью");
        else System.out.println("Данный массив не является строго возрастающей последовательностью");
    }
    public  void taskSeven(){
        Random random = new Random();
        int max=Integer.MIN_VALUE;
        int index=0;
        int[] array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(16);//в задаче указан диапазон чисел 0-15, в лекции было сказано, что надо включать число 15, поэтому в рандом записано число 16
            if(array[i]>max) max=array[i];
            if (array[i]==max) index=i;
        }
        System.out.println("Индекс последнего вхождения максимального элемента "+max+" в массив равен "+index);
    }
    public  void taskEight(){
        System.out.println("Введите целое положительное число");
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        if (number<=0) System.out.println("Введено неподходящее число");
        else {
                int[] array = new int[number];
                Random random = new Random();
                for (int i = 0; i < array.length; i++) {
                    array[i] = random.nextInt(16);
                    System.out.print(array[i]+" ");
                }
        int half=number/2;
                int sum1=0;
                int sum2=0;
            for (int i = 0; i < half; i++) {sum1+=array[i];
            }
            if (number%2==1){for (int i = half+1; i < array.length; i++) {
                    sum2+=array[i];
            }}
            else {for (int i = half; i < array.length; i++) {
                sum2+=array[i];
            }
            }
            System.out.println();
            if (sum1>sum2) System.out.println("Сумма элементов левой половины массива больше");
            else {
                if (sum2>sum1) System.out.println("Сумма элементов правой половины массива больше");
                else System.out.println("Суммы элементов обеих половин массива равны");
            }

        }
    }
    public  void taskNine() {
        System.out.println("Введите целое число больше 3");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 3) System.out.println("Введено неподходящее число");
        else {
            int[] array = new int[n];
            Random random = new Random();
            ArrayList<Integer> list=new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(n+1);
                System.out.print(array[i] + " ");
                if (array[i]%2==0) list.add(array[i]);
            }
            System.out.println();
            int[] array2=new int[list.size()];
            for (int i = 0; i < array2.length; i++) {
                array2[i]= list.get(i);
                System.out.print(array2[i]+" ");
            }
        }
    }
}
