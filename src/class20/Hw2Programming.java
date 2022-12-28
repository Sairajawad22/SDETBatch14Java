package class20;

public class Hw2Programming {
    /*
    Create a class named 'Programming'. While creating an object of the class,
     if nothing is passed to it, then the message "I love programming languages"
     should be printed. If some String is passed to it, then in place of "programming languages"
      the value variable should be printed. Example, if we pass "Java", then "I love Java" should be printed.
     */
    void add() {
        System.out.println("I love programming languages. ");

    }

    void add(String str) {
        System.out.println("I love " + str);

    }

    public static void main(String[] args) {
        Hw2Programming hw2Programming=new Hw2Programming();
        hw2Programming.add();
        hw2Programming.add("Java");
    }
}