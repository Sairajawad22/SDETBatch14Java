package class16;

public class Hw2 {
    /*
    Create a method that will take a String as a parameter and returns
     reversed String. Method should be available to all classes within
     your project and accessible by class name.

     */
    public String reverseString(String word){
        StringBuilder str=new StringBuilder(word);
        str.reverse();
        System.out.println(str.toString());
        return word;
    }

    public static void main(String[] args) {
        Hw2 obj=new Hw2();
        obj.reverseString("My name is Saira");
    }
}
