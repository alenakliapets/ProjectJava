package Lesson6.MyHuman.Shoes;

public class GucciShoes implements IShoes{
    private int price;
    public GucciShoes(int price) {
        this.price = price;
    }
    public GucciShoes(){

    }
    @Override
    public void putOn() {
        System.out.println("Одел обувь Гуччи");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял обувь Гуччи");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
