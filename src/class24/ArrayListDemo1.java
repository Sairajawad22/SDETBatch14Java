package class24;

import java.util.ArrayList;

public class ArrayListDemo1 {
    // there are four peelers 1-inheritance 2-polymorphism 3-Abstraction 4-Encapsulation
    // Encapsulation
    public static void main(String[] args) {
        //Syntax to create an array list
        ArrayList<String> colors = new ArrayList<>();
        // use add method to insert elements in an arrsy list
        colors.add("Red");// com+d=> duplicate line
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        // print all elements
        System.out.println(colors);
        // get method prints individual elements from arraylist
        System.out.println(colors.get(0));
        System.out.println(colors.get(2));
        ;// when we want to know how many elements is there inside the arraylist we use .size() method .However for array we use
        // .length() mthod
        System.out.println(colors.size());

        for (int i = 0; i < colors.size(); i++) {// getting all the elements through the normal fore loop
            System.out.println(colors.get(i));
        }
        System.out.println("**************************");
        for (String color:colors) {// getting all the elements through enhance for loop
            System.out.println(color);

        }
    }
}