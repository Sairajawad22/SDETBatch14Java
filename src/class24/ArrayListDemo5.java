package class24;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        //Syntax to create an array list
        ArrayList<String> colors = new ArrayList<>();
        // use add method to insert elements in an arrsy list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        System.out.println(colors);

        // 2 ways to remove the element of the arrays by remove method. remove method has two variations by value and by index
       // colors.remove("Blue");//1. deleting by actual value
       // System.out.println(colors);
        colors.remove(2);//1. deleting by index
        System.out.println(colors);

    }
}