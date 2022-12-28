package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class Hw2 {
    //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
    public static void main(String[] args) {
        ArrayList<String>drinks=new ArrayList<>();
        drinks.add("Cook");
        drinks.add("Pepsi");
        drinks.add("Lemonade");
        drinks.add("Fanta");
        drinks.add("Spirit");
        drinks.add("Coffee");
        drinks.add("Tea");
        Iterator<String >iterator=drinks.iterator();
        while (iterator.hasNext()){
            String items=iterator.next();
            if(items.contains("a")||items.contains("e")){
                System.out.println("water");
            }else{
                System.out.println(items);
            }
        }

    }

}
