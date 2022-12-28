package class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateDemo2 {
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

    Iterator<String> iterator = beautyProducts.iterator();
        System.out.println(beautyProducts.size());
        while (iterator.hasNext()) {// hasNexr only give us green single for one elements
            System.out.println(iterator.next());


    }
        System.out.println(beautyProducts);

}
}
