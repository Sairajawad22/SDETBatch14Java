package class26;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
     /*
        create an arraylist of drinks.if any drink has letter "a" or "e" replace it with water.
         */

        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Tea");
        drinks.add("fresh Juice");
        drinks.add("Iced Tea");
        drinks.add("Soda");
        drinks.add("canned Juice");
        drinks.add("Milk");
        drinks.add("Chocolate Milk");
        for (int i = 0; i < drinks.size(); i++) {// whenever we want to update elements we cannot use enhance for loop
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.set(i, "Water"); // set is replacing the elements and it works base on index
            }
        }
        System.out.println(drinks);
    }
    }
// we should not solve this task with the iterator because it is slow for e.g bellow
       /*Iterator<String > iterator=drinks.iterator();
       while (iterator.hasNext());
      String drink =iterator.next();
      if(drink.contains("a")||drink.contains("e")){
        NOTE GOD APPROACH
      }*/
