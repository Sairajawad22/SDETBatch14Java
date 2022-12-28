package class24;

import java.util.ArrayList;
import java.util.Arrays;

public class WhyCollectionFramework {

    public static void main(String[] args) {

        /*
        if we have to store a single value we should use variables
         */
                String name="Josh";
                String name2="Joe";
                System.out.println(name);
                System.out.println(name2);
        /*
        if we have to store more than 2 values of same kind then we should go with arrays
        we should use same data type and same categories of data.also if we don't care about spce and we want fast we
        should use array
         */
                String[] names={"Reshad","Adam","Again josh"};


        /*
        fixed in size
         */
                String[] breeds=new String[10];
                breeds[0]="BullDogs";
                System.out.println(Arrays.toString(breeds));

// <> or dimond operator. in array list we don't need to spicifiy the size.since array list is a class we can't use []. we use
        // method which is called .add
                ArrayList<String> colors=new ArrayList<>();
                colors.add("Green");
                colors.add("Red");
                System.out.println(colors.contains("Green"));
                System.out.println(colors);

            }


    }

