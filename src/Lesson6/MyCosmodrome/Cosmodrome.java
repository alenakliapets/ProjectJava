package Lesson6.MyCosmodrome;

public class Cosmodrome {
    public void launch(IStart iStart){
       if (!iStart.checkSystems()) System.out.println("Предстартовая проверка провалена");
       else {
           iStart.engineStart();
           for (int i = 10; i >0 ; i--) {
               System.out.println(i);
              try { Thread.sleep(1000);}
              catch (Exception e){
                  e.printStackTrace();
              }
           }
           iStart.start();
       }
    }
}
