package class25;

import java.util.ArrayList;

public class ContainsAllDemo {

    public static void main(String[] args) {
        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Concealer");
        beautyProducts.add("Mascara");
        beautyProducts.add("Eyeliner");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove soap");
        beautyProducts.add("conditioner");
        beautyProducts.add("shampoo");
        beautyProducts.add("lotion");
       /* System.out.println(beautyProducts.contains("Blush"));
        System.out.println(beautyProducts.contains("Base"));
        System.out.println(beautyProducts.contains("Mascara")); com+shift+/
*/
        // when we want to check if all the items from cosmatics is present inside the beauty we use contains all method
        // if all the items present we get true, if a single item from cosmatic is not present inside the beauty arraylist we get false
        ArrayList<String>cosmatics=new ArrayList<>();
        cosmatics.add("Dove soap");
        cosmatics.add("conditioner");
        cosmatics.add("shampoo");
        cosmatics.add("lotion");
        //cosmatics.add("Josh"); since this item is not present we get false in the console
        System.out.println(beautyProducts.containsAll(cosmatics));

    }
}