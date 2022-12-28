package class28;

import java.util.HashMap;

public class Hw3 {
    /*
    Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
     */
    public static void main(String[] args) {
        HashMap<Integer,String>hashMap=new HashMap<>();
        hashMap.put(7664847 ,"Printer");
        hashMap.put(7879885 ,"TV");
        hashMap.put(7976654 ,"Smart watch");
        hashMap.put(8763527 ,"Hp");
        hashMap.put(7253647 ,"Keyboard");
       // Set<Map.Entry<Integer, String>> ent = hashMap.entrySet();

         var ent=hashMap.entrySet();
        for (var entry:hashMap.entrySet()) {
            System.out.println(entry);
        }

    }
}
