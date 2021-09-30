package Lesson6.MyHuman.Jacket;

public class DolceGabbanaJacket implements IJacket{
    private int price;
    public DolceGabbanaJacket(int price) {
        this.price = price;
    }
    public DolceGabbanaJacket(){

    }
    @Override
    public void putOn() {
        System.out.println("Одел куртку Дольче Габбана");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял куртку Дольче Габбана");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
