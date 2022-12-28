package class20;

public class Hw3 {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
     Then call each overloaded method with specific arguments and observe result.
     */
    static void add(String name, String job, int salary) {
        System.out.println(name +" "+ "is a " + " "+job + " "+"and her salary is " + salary);
    }

    static void add(String name, int salary) {
        System.out.println(name + " salary is " + salary);
    }

    static void add(String name) {
        System.out.println(name + " is getting married on 21 October.");
    }

    public static void main(String[] args) {
        Hw3 hw =new Hw3();
        hw.add("Menhaj",3000);
        hw.add("Anisa","doctor",10000);
        hw.add("Asghar");
    }
}