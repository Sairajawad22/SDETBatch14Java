package class27;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
// maps allow us to store keys and their values. They are not part of collection framework.
// There are tree types of maps. 1) HashMaps 2) LinkedHashMap 3) TreeHashMap
        // keyValue pairs=> String,String
        HashMap<String,String> data=new HashMap<>();
        data.put("UserName","Anton123"); // This is how we store info inside a map. Instead of add method we use put method here.
        data.put("Password","pass123");

        System.out.println(data);
        System.out.println(data.get("Password")); // This is how we can get back the values.In map we should always specigiey the key for
        // which we want to get the value
    }
}
