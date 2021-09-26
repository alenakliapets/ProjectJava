package Lesson5;

public class MilitaryAirTransport extends AirTransport{
    public boolean presenceCatapult;
    public int numberOfRockets;

    public MilitaryAirTransport(int power, int maxSpeed, int weight, String brand, int wingspan, int minimumRunwayLengthForTakeOff, boolean presenceCatapult, int numberOfRockets){

        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
        this.wingspan = wingspan;
        this.minimumRunwayLengthForTakeOff = minimumRunwayLengthForTakeOff;
        this.presenceCatapult = presenceCatapult;
        this.numberOfRockets = numberOfRockets;
    }
    public String description(){
        return "Мощность самолета в лошадиных силах составляет "+power+" л.с." +"\n"+
                "Мощность самолета в киловаттах составляет "+getPowerKv()+" кВ."+"\n"+
                "Максимальная скорость равна "+ maxSpeed +" км/ч."+"\n"+
                "Масса самолета равна "+weight+" кг."+"\n"+
                "Марка самолета "+brand+"."+"\n"+
                "Размах крыльев равен "+wingspan+" м."+"\n"+
                "Минимальная длина ВПП для взлета "+ minimumRunwayLengthForTakeOff+" м"+"\n"+
                "Есть ли система катапультирования  "+presenceCatapult+" ."+"\n"+
                "Количество ракет на борту равно  "+numberOfRockets+" шт.";
    }
    public void shot(){
        if (numberOfRockets>0) System.out.println("Ракета пошла...");
        else System.out.println("Боеприпасы отсутствуют");
    }
public void catapult(){
        if (presenceCatapult) System.out.println("Катапультирование прошло успешно");
        else System.out.println("У вас нет такой системы");
}

    }
