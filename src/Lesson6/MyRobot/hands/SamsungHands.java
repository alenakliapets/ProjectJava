package Lesson6.MyRobot.hands;

import Lesson6.MyRobot.hands.IHand;

public class SamsungHands implements IHand {
    private int price;

    public SamsungHands(int price) {
        this.price = price;
    }

    public SamsungHands() {
    }

    @Override
    public void upHand() {
        System.out.println("Рука Samsung поднята");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
