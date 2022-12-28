package class25;

import java.util.ArrayList;

public class IterateDemo3 {
    public static void main(String[] args) {
        // delete all the produccts which start with letter B or ends with letter A
        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("Lipstick");
        beautyProducts.add("Dove soap");
        // var is key word when we don't want to put data type
      /*  var number=10;
        var name="Saira";
        var decimalNum=56.66;*/

        // place your cursor on iterator then option+enter=>select local variable
        var iterator = beautyProducts.iterator();
        while (iterator.hasNext()){
          // var items=iterator.next(); java 11
            String items=iterator.next();
           if(items.startsWith("B")||items.endsWith("a")){
               iterator.remove();
            }
        }
        System.out.println(beautyProducts);
    }

}
