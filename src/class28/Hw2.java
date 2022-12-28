package class28;

import java.util.*;

public class Hw2 {
    public static void main(String[] args) {
    /*
    Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
     */
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Afganistan", "Kabul");
        countries.put("Pakistan", "Islamabad");
        countries.put("USA", "Washington DC");
        countries.put("Russia", "Moscow");
        countries.put("India", "New Dehli");
        countries.put("England", "London");
        System.out.println("1) All keys and values from the country map using for each loop ");
        Set<Map.Entry<String, String>> entrySet = countries.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("2) All keys and values from the country map using iterator ");
        Iterator<Map.Entry<String, String>> iterator = countries.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> it = iterator.next();
            System.out.println(it.getKey() + " " + it.getValue());
        }
        System.out.println("3) All values from the country map using for each loop ");
        Collection<String> values = countries.values();
        for (String value : values) {
            System.out.println(value + " ");
        }
        System.out.println(" ");
        System.out.println("4) All values from the country map using iterator");
        Iterator<String> ite = countries.values().iterator();
        while (ite.hasNext()) {
            var it = ite.next();
            System.out.println(it + " ");
        }
    }
}