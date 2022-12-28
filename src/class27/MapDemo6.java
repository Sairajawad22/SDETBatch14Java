package class27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo6 {
    public static void main(String[] args) {
        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",1.99); // to Store the values in a map
        fruit.put("Mango",1.99);
        fruit.put("Orange",4.99);
        fruit.put("Banana",10.1);
        //EntrySet is a method which will return us a set of entries.Entry is another calss which hold to things the key and value
        Set<Map.Entry<String,Double>>entrySet =fruit.entrySet();
        Iterator<Map.Entry<String,Double>> iterator=entrySet.iterator();
        while (iterator.hasNext());
    }
}
