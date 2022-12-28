package class28;

import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
       TreeMap<Integer,PersonHw4>person = new TreeMap<>();
      person.put(01,new PersonHw4("Sana","Ahmed",25,3500));
      person.put(02,new PersonHw4("Jawad","Koshan",35,5800));
      person.put(03,new PersonHw4("Aynoor","Raz",20,4000));
      person.put(04,new PersonHw4("Jamal","Farooq",40,6000));

        for (Integer key:person.keySet()) {
            person.get(key).printInfo();
        }
    }
}
