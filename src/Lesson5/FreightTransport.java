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
        return "Мощность грузовой машины в лошадиных силах составляет "+power+" л.с." +"\n"+
                "Мощность грузовой машины в киловаттах составляет "+getPowerKv()+" кВ."+"\n"+
                "Максимальная скорость грузовой машины равна "+ maxSpeed +" км/ч."+"\n"+
                "Масса грузовой машины равна "+weight+" кг."+"\n"+
                "Марка грузовой машины "+brand+"."+"\n"+
                "Количество колес грузовой машины равно "+numberOfWheels+" шт."+"\n"+
                "Расход топлива грузовой машины равен "+ fuelConsumption+" л/100 км"+"\n"+
                "Грузоподъемность грузовой машины равна "+liftingCapacity+" т.";
    }
    public void loading(double cargoWeight){
if (cargoWeight<=liftingCapacity) System.out.println("Грузовик загружен");
else System.out.println("Вам нужен грузовик побольше");
    }


}
