package Lesson6.MyRobot.legs;

public class SonyLegs implements ILeg{

    private int price;

    public SonyLegs(int price) {
        this.price = price;
    }

    public SonyLegs() {
    }
    @Override
    public void step() {
        System.out.println("Нога Sony шагнула");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
