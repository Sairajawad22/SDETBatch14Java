package Class13;

public class Hw5 {
    public static void main(String[] args) {
        /*
        How would you check if String is palindrome or not? aba=> true Abbc =>false

         */
        String myString = "bob";
        StringBuffer buffer = new StringBuffer(myString);
        buffer.reverse();
        String name = buffer.toString();
        if(myString.equals(name)){
            System.out.println("Given String is palindrome");
        } else {
            System.out.println("Given String is not palindrome");
        }
    }
    }

