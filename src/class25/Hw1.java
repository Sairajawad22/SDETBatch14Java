package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class Hw1 {
    public static void main(String[] args) {
        //Create an arrayList of words. Remove every word that ends with “e”.
        ArrayList<String> words = new ArrayList<>();
        words.add("book");
        words.add("beside");
        words.add("pen");
        words.add("above");
        words.add("house");
        words.add("dish");
        words.add("abuse");
        words.add("food");
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String items = iterator.next();
            if (items.endsWith("e")) {
                iterator.remove();

            }
        }
        System.out.println(words);
    }
}