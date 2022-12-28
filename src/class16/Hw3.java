package class16;

public class Hw3 {
    /*
    Create a method that will accept a String as a parameter
     and return a new String that consist only of vowels.
     Method should be available inside the class only where it was
     declared and executed by calling it is name.
     */
    private String vowels(String word){
        String vowels= word.replaceAll("[^ aeoui]","");

        return vowels;
    }

    public static void main(String[] args) {
        Hw3 obj =new Hw3();
        System.out.println( obj.vowels("Afghanistan"));


    }
}
