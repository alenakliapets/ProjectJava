package Lesson6.MyHuman.Jacket;

public class VersaceJacket implements IJacket{
    private int price;
    public VersaceJacket(int price) {
        this.price = price;
    }
    public VersaceJacket(){

    }
    @Override
    public void putOn() {
        System.out.println("Одел куртку Версаче");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял куртку Версаче");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
