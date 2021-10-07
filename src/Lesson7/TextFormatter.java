package Lesson7;

public class TextFormatter {
    public static int numberOfWords(String line){
        String [] array = line.split(" ");
        return array.length;
    }
    public static boolean hasPolindrome(String line){
        boolean hasPolind = false;
        String [] array = line.split(" ");
        for (int i = 0; i < array.length; i++) {
            String reverse="";
            for (int j = array[i].length()-1; j >=0 ; j--) {
            reverse += array[i].charAt(j);
            }
            if (array[i].equalsIgnoreCase(reverse)) hasPolind = true;
        }
        return hasPolind;
    }
}
