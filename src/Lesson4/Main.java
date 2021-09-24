package Lesson4;

public class Main {
    public static void main(String[] args) {
        Computer myComputer = new Computer("Apple M1", "8 Gb", "512 Gb", 2);
        String macCpu = myComputer.getCpu();
        String macRam = myComputer.getRam();
        String macSsd = myComputer.getSsd();
        int macResource = myComputer.getResource();

        myComputer.description();
        while (myComputer.getResource() > 0) {
            System.out.println();
            myComputer.turnOn();
            System.out.println();
            myComputer.turnOff();
        }
    }
}