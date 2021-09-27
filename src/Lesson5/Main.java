package Lesson5;

public class Main {
    public static void main(String[] args) {
     PassengerTransport pas=new PassengerTransport(100, 150, 1000, "BMW", 4, 20,"Hachback", 5);
       System.out.println(pas.description());
        System.out.println();
       FreightTransport frei=new FreightTransport(80, 100, 2000, "MAN", 12, 225, 3);
        System.out.println(frei.description());
        System.out.println();
        CivilAirTransport civil=new CivilAirTransport(1000, 300, 3000, "Boing", 50, 200, 250, true);
        System.out.println(civil.description());
        System.out.println();
        MilitaryAirTransport military = new MilitaryAirTransport(1500, 300, 3400, "Boing", 55, 250, false, 0);
        System.out.println(military.description());
        pas.possibleWay(3.5);
frei.loading(5);
civil.loadingPassengers(300);
        military.catapult();
        military.shot();
    }
}
