package Lesson5;

public class CivilAirTransport extends AirTransport{
    public int numberOfPassengers;
    public boolean businessClassAvailability;

    public CivilAirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minimumRunwayLengthForTakeOff, int numberOfPassengers, boolean businessClassAvailability){

        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
        this.wingspan = wingspan;
        this.minimumRunwayLengthForTakeOff = minimumRunwayLengthForTakeOff;
        this.numberOfPassengers = numberOfPassengers;
        this.businessClassAvailability = businessClassAvailability;
    }
    public String description(){
        return "Мощность самолета в лошадиных силах составляет "+power+" л.с." +"\n"+
                "Мощность самолета в киловаттах составляет "+getPowerKv()+" кВ."+"\n"+
                "Максимальная скорость равна "+ maxSpeed +" км/ч."+"\n"+
                "Масса самолета равна "+weight+" кг."+"\n"+
                "Марка самолета "+brand+"."+"\n"+
                "Размах крыльев равен "+wingspan+" м."+"\n"+
                "Минимальная длина ВПП для взлета "+ minimumRunwayLengthForTakeOff+" м"+"\n"+
                "Количество пассажиров равно  "+numberOfPassengers+" человек."+"\n"+
                "Есть ли бизнес класс  "+businessClassAvailability+" .";
    }
    public void loadingPassengers(int ourNumberOfPass){
        if (ourNumberOfPass<=numberOfPassengers) System.out.println("Самолет заполнен");
        else System.out.println("Вам нужен самолет побольше");
    }
}
