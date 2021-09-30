package Lesson6.MyHuman.Pants;

public class VersacePants implements IPants{
    private int price;
    public VersacePants(int price) {
        this.price = price;
    }
public VersacePants(){

}
    @Override
    public void putOn() {
        System.out.println("Одел штаны Версаче");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял штаны Версаче");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
