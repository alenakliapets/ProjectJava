package Lesson7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int firstIndexA = line.indexOf("A");
        int lastIndexB = line.lastIndexOf("B");
     line = line.substring(firstIndexA,lastIndexB);
        System.out.println(line);
    }
}
