package Lesson6.MyHuman.Shoes;

public class VersaceShoes implements IShoes{
    private int price;
    public VersaceShoes(int price) {
        this.price = price;
    }
    public VersaceShoes(){

    }
    @Override
    public void putOn() {
        System.out.println("Одел обувь Версаче");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял обувь Версаче");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
