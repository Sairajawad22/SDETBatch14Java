package class24;

import java.util.ArrayList;

public class Hw {
    /*
    Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
     */
    public static void main(String[] args) {
        ArrayList<String > names=new ArrayList<>();
        names.add("Jawad");
        names.add("Menhaj");
        names.add("Bila");
        names.add("Meraj");
        names.add("Qais");

        System.out.println("If the given ArrayList is empty "+ names.isEmpty());
        System.out.println("If the specific name is present in an ArrayList "+ names.contains("Menhaj"));
        System.out.println("the specific name is not present in an ArrayList "+names.contains("Lina"));
        System.out.println("Size of the array list is "+ names.size());

    }

}
