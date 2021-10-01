package Lesson6.MyHuman.Shoes;

public class DolceGabbanaShoes implements IShoes{
    private int price;
    public DolceGabbanaShoes(int price) {
        this.price = price;
    }
    public DolceGabbanaShoes(){

    }
    @Override
    public void putOn() {
        System.out.println("Одел обувь Дольче Габбана");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял обувь Дольче Габбана");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
