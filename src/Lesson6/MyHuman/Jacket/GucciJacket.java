package Lesson6.MyHuman.Jacket;

public class GucciJacket implements IJacket{
    private int price;
    public GucciJacket(int price) {
        this.price = price;
    }
public GucciJacket(){

}
    @Override
    public void putOn() {
        System.out.println("Одел куртку Гуччи");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял куртку Гуччи");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
