package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove soap");
        beautyProducts.add("conditioner");
        beautyProducts.add("Primer");
        beautyProducts.add("shampoo");
        beautyProducts.add("lotion");
        beautyProducts.add("Concealer");
        beautyProducts.add("Eyeliner");
      Iterator<String> iterator =beautyProducts.iterator();// how to get the iterator from the list
        /*
        Once we get the object there are three methods which are present inside the
        iterator interface
         */

        // First one is  iterator.hasNext();. As long as there are items inside the iterator, it will gives us true
        /*System.out.println (iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println (iterator.hasNext());
        // we can remove items from the iterate by calling the method iterate.next(), it also gives us the item
       iterator.next();
       iterator.next();
        System.out.println(iterator.next());*/
         while(iterator.hasNext()){
             System.out.println(iterator.next());
         }

    }
}