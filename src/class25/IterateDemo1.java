package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateDemo1 {
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
        //if we want to use the iterator in our code first step we have to get the iterator or create the object of the iterator
        Iterator<String> iterator = beautyProducts.iterator();
        // there are three method indide the iterator 1. hasNext() 2. next() 3. remove()
        while (iterator.hasNext()) {// hasNext gives us true as long as there item left indide the iterator
            String items=iterator.next();// we get the item
            if(items.endsWith("r")){
                iterator.remove();
            }
        }
        System.out.println(beautyProducts);
    }
}