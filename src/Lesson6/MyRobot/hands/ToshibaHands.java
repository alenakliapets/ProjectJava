package Lesson6.MyRobot.hands;

public class ToshibaHands implements IHand {
    private int price;

    public ToshibaHands(int price) {
        this.price = price;
    }

    public ToshibaHands() {
    }

    @Override
    public void upHand() {
        System.out.println("Рука Toshiba поднята");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
