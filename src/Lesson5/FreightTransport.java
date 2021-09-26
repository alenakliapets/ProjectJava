package Lesson5;

public class FreightTransport extends LandTransport{
    public int liftingCapacity;

    public FreightTransport(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption, int liftingCapacity){

        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
        this.liftingCapacity = liftingCapacity;
    }
    public String description(){
        return "Мощность машины в лошадиных силах составляет "+power+" л.с." +"\n"+
                "Мощность машины в киловаттах составляет "+getPowerKv()+" кВ."+"\n"+
                "Максимальная скорость равна "+ maxSpeed +" км/ч."+"\n"+
                "Масса машины равна "+weight+" кг."+"\n"+
                "Марка машины "+brand+"."+"\n"+
                "Количество колес равно "+numberOfWheels+" шт."+"\n"+
                "Расход топлива равен "+ fuelConsumption+" л/100 км"+"\n"+
                "Грузоподъемность равна "+liftingCapacity+" т.";
    }
    public void loading(double cargoWeight){
if (cargoWeight<=liftingCapacity) System.out.println("Грузовик загружен");
else System.out.println("Вам нужен грузовик побольше");
    }


}
