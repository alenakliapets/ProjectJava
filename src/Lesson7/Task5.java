package Lesson7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//Текст исходный
//Зип пакеты для хранения удобны в транспортировке, герметично закрываются, защищают от проникновения грязи и пыли.
//Благодаря пакеты струнному замку и прочному материалу, из которого выполнен упаковочный пакет, в нём можно хранить даже те продукты, которые источают неприятные запахи.
//Пакеты с застёжкой пригодны для длительного использования: они полностью безопасны и не выделяют вредных токсичных веществ.

//Black list
//        Зип
//        Пакеты

public class Task5 {
    public static void main(String[] args) {
        String text1 = "";
        String allText1 = "";
        String text2 = "";
        String allText2 = "";
        try (BufferedReader reader1 = new BufferedReader
                (new FileReader("/Users/elenaklepec/IdeaProjects/Test4"));
        BufferedReader reader2 = new BufferedReader
                (new FileReader("/Users/elenaklepec/IdeaProjects/Test5"))){
            while (reader1.ready()){
                text1 = reader1.readLine();
                allText1 +=text1 + "\n";
            }
            while (reader2.ready()){
                text2 = reader2.readLine();
                allText2 +=text2 + "\n";
            }
        }
        catch (IOException e){
            System.out.println("IOException");
        }
        String [] blackList = allText2.split("\\n");
        String [] sentences = allText1.split("\n");
        ArrayList <String> list = new ArrayList<>();
        for (int i=0; i<sentences.length; i++){
            for (int j = 0; j < blackList.length; j++) {
                    if (sentences[i].toLowerCase().contains(blackList[j].toLowerCase())){
                       list.add(sentences[i]);
                       j = blackList.length;
                }
            }
        }
        if (list.size()==0) System.out.println("Текст прошел проверку на цензуру");
        else {
            System.out.println("Текст не прошел проверку на цензуру");
            System.out.println("Количество предложений, не прошедших проверку " + list.size());
            System.out.println("Предложения, которые необходимо исправить:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }
}
