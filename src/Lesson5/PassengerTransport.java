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
        return "Мощность машины в лошадиных силах составляет "+power+" л.с." +"\n"+
                "Мощность машины в киловаттах составляет "+getPowerKv()+" кВ."+"\n"+
                "Максимальная скорость равна "+ maxSpeed +" км/ч."+"\n"+
                "Масса машины равна "+weight+" кг."+"\n"+
                "Марка машины "+brand+"."+"\n"+
                "Количество колес равно "+numberOfWheels+" шт."+"\n"+
                "Расход топлива равен "+ fuelConsumption+" л/100 км"+"\n"+
                "Тип кузова "+bodyType+"."+"\n"+
                "Количество пассажиров равно "+numberOfPassengers+" человек.";
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
