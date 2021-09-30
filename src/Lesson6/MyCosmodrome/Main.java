package Lesson6.MyCosmodrome;

public class Main {
    public static void main(String[] args) {
        Cosmodrome myCosmodrome = new Cosmodrome();
//        ShuttleColumbia shuttleColumbia=new ShuttleColumbia();
//        myCosmodrome.launch(shuttleColumbia);
//        ShuttleDiscovery shuttleDiscovery=new ShuttleDiscovery();
//        myCosmodrome.launch(shuttleDiscovery);
        ShuttleChallenger shuttleChallenger=new ShuttleChallenger();
        myCosmodrome.launch(shuttleChallenger);
    }
}
