package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String cpu;
    private String ram;
    private String ssd;
    private int resource;
    boolean condition = false; //true - включен, false - выключен

    public Computer(String cpu, String ram, String ssd, int resource) {
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.resource = resource;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }
    public void description(){
        System.out.println("Процессор на этом компьютере "+getCpu());
        System.out.println("Оперативная память на этом компьютере "+getRam());
        System.out.println("Жесткий диск на этом компьютере "+getSsd());
        System.out.println("Ресурс полных циклов работы равен "+getResource());
    }
public void turnOn(){
        if (resource==0) {System.out.println("Компьютер не включится, так как он сгорел"); return;}
       if (condition) System.out.println("Компьютер уже итак включен");
       else{
           Random random = new Random();
           int numberRandom=random.nextInt(2);
           Scanner scanner=new Scanner(System.in);
           int numberMine=scanner.nextInt();
           if (numberRandom!=numberMine) {
               System.out.println("Компьютер сгорел");
               resource=0;}
           else {
               System.out.println("Компьютер включен");
               condition=true;
           }
       }
}
public void turnOff(){
    if (resource==0) {System.out.println("Компьютер не надо выключать, так как он сгорел"); return;}
        if (!condition) System.out.println("Компьютер уже итак выключен");
        else {
            Random random = new Random();
            int numberRandom=random.nextInt(2);
            Scanner scanner=new Scanner(System.in);
            int numberMine=scanner.nextInt();
            if (numberRandom!=numberMine) {
                System.out.println("Компьютер сгорел");
                resource=0;}
            else {
                System.out.println("Компьютер выключен");
                condition=false;
                resource-=1;
                if (resource==0) System.out.println("Ресурс выработан, компьютер сгорел");
            }
        }
}
}
