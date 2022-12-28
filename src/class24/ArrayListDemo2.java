package class24;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        // how to store integere inside the arraylist
        ArrayList<Integer> numbers= new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(35);

        int a=34;
        numbers.add(a);
        System.out.println(numbers);
        System.out.println("***************************");
        for (Integer num:numbers) {
            System.out.println(num);

        }
//problem.  with the colllecton farem work we can not use primitive data type. CF only support classes/objects.
        //solutions. in order to solve this issue we have to find something to store primative data type, and that is a class.
        // for every primative data type jave developer created class.f.e.g for int they created Integer class
        // int=>integer
        // boolean=>Boolean
        //byte=>Byte
        //double=>Double
        // long=>Long
       // float=>Float
        //char=>Character
    }

}
