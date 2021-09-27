package Lesson5;

public class MilitaryAirTransport extends AirTransport{
    public boolean presenceCatapult;
    public int numberOfRockets;

    public MilitaryAirTransport(int power, int maxSpeed, int weight, String brand, int wingspan,
                                int minimumRunwayLengthForTakeOff, boolean presenceCatapult,
                                int numberOfRockets){

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
        return "Мощность грузового самолета в лошадиных силах составляет "+power+" л.с." +"\n"+
                "Мощность грузовогосамолета в киловаттах составляет "+getPowerKv()+" кВ."+"\n"+
                "Максимальная скорость грузового самолета равна "+ maxSpeed +" км/ч."+"\n"+
                "Масса грузового самолета равна "+weight+" кг."+"\n"+
                "Марка грузового самолета "+brand+"."+"\n"+
                "Размах крыльев грузового самолета равен "+wingspan+" м."+"\n"+
                "Минимальная длина ВПП для взлета грузового самолета "+ minimumRunwayLengthForTakeOff+" м"+"\n"+
                "Есть ли система катапультирования в грузовом самолете "+presenceCatapult+" ."+"\n"+
                "Количество ракет на борту грузового самолета равно  "+numberOfRockets+" шт.";
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
