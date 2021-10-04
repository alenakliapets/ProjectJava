package Lesson7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char index3 = line.charAt(3);
        char index0 = line.charAt(0);
        String ind3 = "" + index3;
        String ind0 = "" + index0;
    line = line.replaceAll(ind3,ind0);
        System.out.println(line);


    }
}
