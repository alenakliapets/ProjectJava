package Lesson7;

import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        String text = "";
        String allText = "";
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/elenaklepec/IdeaProjects/Test4"))){
            while (reader.ready()){
               text = reader.readLine();
               if ((TextFormatter.hasPolindrome(text)) ||
                       ((TextFormatter.numberOfWords(text)>=3)&&(TextFormatter.numberOfWords(text)<=5)))
                allText +=text + "\n";
            }
        }
        catch (IOException e){
            System.out.println("IOException");
        }
        try {
            BufferedWriter stream = new BufferedWriter(new FileWriter("/Users/elenaklepec/IdeaProjects/Test5"));
            stream.write(allText);
            stream.flush();
        }
        catch (IOException e){
            System.out.println("FileNotFoundException");
        }
    }
}
