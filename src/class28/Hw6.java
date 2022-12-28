package class28;

import java.util.LinkedHashSet;

public class Hw6 {
    /*
    Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.

     */
    public static void main(String[] args) {
        LinkedHashSet<String> objects = new LinkedHashSet<>();
        objects.add("H");
        objects.add("o");
        objects.add("u");
        objects.add("s");
        objects.add("e");

        String text="";
        for (var obj:objects) {
            text=text+obj;
        }
        System.out.println(text);
    }
}
