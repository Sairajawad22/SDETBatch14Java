package class24;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String >name=new ArrayList<>();
        name.add("Saira");
        name.add("Sonam") ;
        name.add("MJ");
        name.add("Bilal");
        name.add("Hina");
        name.set(2,"Ahmad");// set method replace element
        name.add(0,"Hina again");// it will shift this(Hina again) elements to the first one
        System.out.println(name);


        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(35);
        numbers.add(1,100);
        numbers.add(0,1200);
        System.out.println(numbers);
        numbers.clear();// it will delete all the elements from the list
        System.out.println(numbers);
    }
}
