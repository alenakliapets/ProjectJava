package Lesson6.MyHuman;

import Lesson6.MyHuman.Jacket.IJacket;
import Lesson6.MyHuman.Pants.IPants;
import Lesson6.MyHuman.Shoes.IShoes;

public class Human implements IHuman{
    private IJacket jacket;
    private IPants pants;
    private IShoes shoes;
    private String name;

    public Human(String name, IJacket jacket, IPants pants, IShoes shoes) {
        this.name=name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public IPants getPants() {
        return pants;
    }

    public void setPants(IPants pants) {
        this.pants = pants;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    @Override
    public void putOn() {
        jacket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    @Override
    public void takeOff() {
jacket.takeOff();
pants.takeOff();
shoes.takeOff();
    }

    @Override
    public int getPrice() {
        int price=jacket.getPrice()+pants.getPrice()+shoes.getPrice();
        return price;
    }
}
