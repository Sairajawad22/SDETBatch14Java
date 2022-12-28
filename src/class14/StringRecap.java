package class14;

import java.util.Arrays;

public class StringRecap {
    public static void main(String[] args) {
        String str= "kdfjhffKJHGHJKK2453@!#$%^^";
       // str.replaceAll("[a-z]","");remove only the lower case
        str=str.replaceAll("[^a-zA-Z]","");// only keep the upper and lower case and remove the rest
        System.out.println("str = " + str);//soutv+inter will show the last variable we have created

        String sentence="Batch 14 is Great. Is batch 14 is excellent? Batch 14 is just amazing";
      String[] split =sentence.split("[.?]");// it means we are splitting the . to ?
        System.out.println("(split = " + Arrays.toString(split));
        
        String str2="Batch 14 is Great. Batch 14 is Great";
        String replace = str2.replaceFirst("Great", "Good");//
        System.out.println(replace);
    }



}
