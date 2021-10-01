package Lesson6.MyCosmodrome;

import java.util.Random;

public class ShuttleChallenger implements IStart{
    @Override
    public boolean checkSystems() {
        Random random=new Random();
        int i= random.nextInt(10);
        int j=random.nextInt(10);
        return i+j > 7;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла Челленджер запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла Челленджер");
    }
}