package class17;

public class Hw4 {
    //Write program that have static constructor and observe result.
    String firstName;
    String lastName;

    static String Hw4(String firstName, String lastName) {
        firstName = firstName;
        lastName = lastName;

        return firstName + lastName;
    }

    public static void main(String[] args) {
        Hw4 obj = new Hw4();
        System.out.println(Hw4("Saira", "Jawad"));
    }
}