package class25;

import java.util.ArrayList;

public class WhyWeNeedIterator {
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

        /*for(int i=0; i<beautyProducts.size(); i++ ){
            if(beautyProducts.get(i).endsWith("r")){
                beautyProducts.remove(i);
            }
        }*/// this is not working because it produce bugs. because of the it iterate 11 times the size will change
        /*
        NOTE:
        whenever we want to use contains or remove in arrylist we should never use loops b/c it can change the size
        and the loop might execute different number of size vs your arraylisr have different number of size.there can be missmatch
        therefore we should never use loop when we want to add,remove items in or frorm a list
        similar we cannot use inhace for loop it give us error
         */
        System.out.println(beautyProducts);
    }
}
