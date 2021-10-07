package Lesson7.Task6;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("car.txt"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("car.txt"))){
        Car car = new Car("BMW", 150, 15000);
        oos.writeObject(car);
        Car newCar = (Car) ois.readObject();
            System.out.println(newCar.getBrand());
            System.out.println(newCar.getSpeed());
            System.out.println(newCar.getPrice());
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
