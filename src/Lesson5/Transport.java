package Lesson5;

public class Transport {
    public int power;
    public int maxSpeed;
    public int weight;
    public String brand;

    public double getPowerKv(){
        return power*0.74;
    }
}
