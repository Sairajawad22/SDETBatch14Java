package class25;

import java.util.ArrayList;

public class IterateDemo4WhithLambda {
    public static void main(String[] args) {
        // delete all the produccts which start with letter B or ends with letter A
        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove soap");

        beautyProducts.removeIf(items -> items.startsWith("B"));
        System.out.println(beautyProducts);
    }
}
