package Lesson6.MyRobot.legs;

public class ToshibaLegs implements ILeg{
    private int price;

    public ToshibaLegs(int price) {
        this.price = price;
    }

    public ToshibaLegs() {
    }
    @Override
    public void step() {
        System.out.println("Нога Toshiba шагнула");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
