package class28;

import java.util.LinkedList;

public class Hw7 {
    /*
    Create a collection of integers in which you can keep duplicates.
Write a logic to find sum of all integers
     */
    public static void main(String[] args) {
        LinkedList<Integer>numbers=new LinkedList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        numbers.add(10);
        int sum=0;
        for (var num:numbers) {
           sum=sum+num;
        }
        System.out.println("The sum of all the numbers is :"+sum);
    }
}
