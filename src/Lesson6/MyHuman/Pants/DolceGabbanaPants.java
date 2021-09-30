package Lesson6.MyHuman.Pants;

public class DolceGabbanaPants implements IPants{
    private int price;
    public DolceGabbanaPants(int price) {
        this.price = price;
    }
    public DolceGabbanaPants(){

    }
    @Override
    public void putOn() {
        System.out.println("Одел штаны Дольче Габбана");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял штаны Дольче Габбана");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
