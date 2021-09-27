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
        return "Мощность пассажирского самолета в лошадиных силах составляет "+power+" л.с." +"\n"+
                "Мощность пассажирского самолета в киловаттах составляет "+getPowerKv()+" кВ."+"\n"+
                "Максимальная скорость пассажирского самолета равна "+ maxSpeed +" км/ч."+"\n"+
                "Масса пассажирского самолета равна "+weight+" кг."+"\n"+
                "Марка пассажирского самолета "+brand+"."+"\n"+
                "Размах крыльев пассажирского самолета равен "+wingspan+" м."+"\n"+
                "Минимальная длина ВПП для взлета пассажирского самолета "+ minimumRunwayLengthForTakeOff+" м"+"\n"+
                "Количество пассажиров пассажирского самолета равно  "+numberOfPassengers+" человек."+"\n"+
                "Есть ли бизнес класс в пассажирском самолете  "+businessClassAvailability+" .";
    }
    public void loadingPassengers(int ourNumberOfPass){
        if (ourNumberOfPass<=numberOfPassengers) System.out.println("Самолет заполнен");
        else System.out.println("Вам нужен самолет побольше");
    }
}
