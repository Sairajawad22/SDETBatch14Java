package class26;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class WhySet {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        System.out.println(numbers);

        LinkedHashSet<Integer> setNumber=new LinkedHashSet<>();
        setNumber.add(10);
        setNumber.add(10);
        setNumber.add(10);
        System.out.println(setNumber);

    }
}
