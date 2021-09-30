package Lesson6.MyRobot.legs;

public class SamsungLegs implements ILeg{
    private int price;

    public SamsungLegs(int price) {
        this.price = price;
    }

    public SamsungLegs() {
    }
    @Override
    public void step() {
        System.out.println("Нога Samsung шагнула");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
