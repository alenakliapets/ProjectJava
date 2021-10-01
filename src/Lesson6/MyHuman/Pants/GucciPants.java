package Lesson6.MyHuman.Pants;

public class GucciPants implements IPants{
    private int price;
    public GucciPants(int price) {
        this.price = price;
    }
    public GucciPants(){

    }
    @Override
    public void putOn() {
        System.out.println("Одел штаны Гуччи");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял штаны Гуччи");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
