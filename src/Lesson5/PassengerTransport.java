package Lesson5;

public class PassengerTransport extends LandTransport{

    public String bodyType;
    public int numberOfPassengers;

    public PassengerTransport(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption, String bodyType, int numberOfPassengers) {
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
        this.power=power;
    }


    public String description(){
        return "Мощность легковой машины в лошадиных силах составляет "+power+" л.с." +"\n"+
                "Мощность легковой машины в киловаттах составляет "+getPowerKv()+" кВ."+"\n"+
                "Максимальная скорость легковой машины равна "+ maxSpeed +" км/ч."+"\n"+
                "Масса легковой машины равна "+weight+" кг."+"\n"+
                "Марка легковой машины "+brand+"."+"\n"+
                "Количество колес легковой машины равно "+numberOfWheels+" шт."+"\n"+
                "Расход топлива легковой машины равен "+ fuelConsumption+" л/100 км"+"\n"+
                "Тип кузова легковой машины "+bodyType+"."+"\n"+
                "Количество пассажиров легковой машины равно "+numberOfPassengers+" человек.";
    }

    public void possibleWay(double hours){
    double way=hours*maxSpeed;
    double consumption = fuelConsumpt(way);
        System.out.println("За время "+hours+" ч, автомобиль "+brand+" двигаясь с максимальной скоростью "+
                maxSpeed+"км/ч проедет "+way+" км и израсходует "+consumption+" литров топлива.");
    }

    private double fuelConsumpt(double way) {
        return way / 100 * fuelConsumption;
    }
}
