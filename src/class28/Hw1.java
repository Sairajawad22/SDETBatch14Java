package class28;

import java.util.HashMap;
import java.util.Map;

public class Hw1 {
    public static void main(String[] args) {

    /*
    Create a map of a building. Store floor number and it is associated company name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
     */
        Map<Integer, String> maps = new HashMap<>();
        maps.put(1,"Apple");
        maps.put(2,"Amazon");
        maps.put(3,"Samsung");
        maps.put(4,"Microsoft");
        maps.put(5,"Dell");
        maps.put(6,"Syntax");
        maps.put(7,"Apple");
        int sizes = maps.size();
        System.out.println("The original numbers of the floor in th building are "+sizes);
        System.out.println("The original number of the floors sre "+maps);
      maps.replace(4,"Google");
        maps.remove(7);
        System.out.println("This is the new floors "+maps);

    }
}