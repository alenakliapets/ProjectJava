package Lesson6.MyCosmodrome;

import java.util.Random;

public class ShuttleDiscovery implements IStart{
    @Override
    public boolean checkSystems() {
        Random random=new Random();
        int i= random.nextInt(3);
        int j=random.nextInt(3);
        return i != j;
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла Дискавери запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла Дискавери");
    }
}