package class25;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String >makeUpItem=new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("Concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("Eyeliner");
        makeUpItem.add("Lipstick");

        ArrayList<String>cosmatics=new ArrayList<>();
        cosmatics.add("Dove soap");
        cosmatics.add("conditioner");
        cosmatics.add("shampoo");
        cosmatics.add("lotion");

        ArrayList<String>beautyProducts=new ArrayList<>();
        // addAll() method add everything from a least inside another list or combine in a single list
        // Or when we want to combine multiple list together in a single line we use addAll method
        // addAll method adds everything from makeup list and cosmatic list into beautyProducts
        beautyProducts.addAll(makeUpItem);
        beautyProducts.addAll(cosmatics);
        System.out.println(beautyProducts);
        // remove method it remove single element/item from arraylist
        beautyProducts.remove("lotion");// romove by actual value
        System.out.println(beautyProducts);
        // remove all method remove everything from arraylist which we are passing indide the beautyProducts as asgument
        beautyProducts.removeAll(cosmatics);
        System.out.println(beautyProducts);
        //clear remove everything
        beautyProducts.clear();
        System.out.println(beautyProducts);
    }
}
