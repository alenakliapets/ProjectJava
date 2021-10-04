package Lesson7;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        String text="";
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/elenaklepec/IdeaProjects/Test4"))){
            while (reader.ready()){
                text += reader.readLine() + "\n";
            }
        }
        catch (IOException e){
            System.out.println("IOException");
        }
        String [] array = text.split("\n");
        String reverse = "";
        for (int i = 0; i < array.length; i++){
            for (int j = array[i].length() - 1; j >= 0 ; j--) {
                reverse +=  array[i].charAt(j);
            }
            if (i<array.length-1) reverse += "\n";
        }
       String [] array2 = reverse.split("\n");
        try {BufferedWriter stream = new BufferedWriter(new FileWriter("/Users/elenaklepec/IdeaProjects/Test5"));
            for (int i = 0; i < array.length; i++) {
                if (array[i].equalsIgnoreCase(array2[i])) stream.write(array[i]+"\n");
            }
            stream.flush();
        }
        catch (IOException e){
            System.out.println("FileNotFoundException");
        }
    }
}
