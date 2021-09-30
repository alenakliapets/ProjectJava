package Lesson6.MyCosmodrome;

import java.util.Random;

public class ShuttleColumbia implements IStart{

    @Override
    public boolean checkSystems() {
        Random random=new Random();
        int i= random.nextInt(11);
        return i > 3;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла Колумбия запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла Колумбия");
    }
}
