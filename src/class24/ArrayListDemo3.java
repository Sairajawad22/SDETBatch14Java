package class24;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        // How to store different data type inside the arraylist?

        //storing char inside the arraylist
        ArrayList<Character> chars=new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('Z');
        chars.add('G');
// storing boolean inside the boolean class
        ArrayList<Boolean>booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        System.out.println(booleans);

       // storing float inside the float class
        ArrayList<Float>floats=new ArrayList<>();
        floats.add(12.5f);
        floats.add(12f);
        System.out.println(floats);
    }
}
