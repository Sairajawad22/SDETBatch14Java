package Class13;

public class Hw5 {
    public static void main(String[] args) {
        /*
        How would you check if String is palindrome or not? aba=> true Abbc =>false

         */
        String str = "bob";
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        if(stringBuilder.toString().equals(str)){
            System.out.println("Given String is palindrome");
        } else {
            System.out.println("Given String is not palindrome");
        }
    }
    }

