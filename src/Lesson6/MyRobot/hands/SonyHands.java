package Lesson6.MyRobot.hands;

import Lesson6.MyRobot.hands.IHand;

public class SonyHands implements IHand {
    private int price;

    public SonyHands(int price) {
        this.price = price;
    }

    public SonyHands() {
    }

    @Override
    public void upHand() {
        System.out.println("Рука Sony поднята");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
