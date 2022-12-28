package class17;

public class Task2 {
    /*
    Create a method that will take a String as a parameter and returns
     reversed String. Method should be available to all classes within
     your project and accessible by class name.

     */
   public static String reversestr(String str){
        String newstr;
        StringBuilder sb= new StringBuilder(str);
        sb.reverse();
        newstr=sb. toString();

        return newstr;
    }

    public static void main(String[] args) {
        System.out.println(Task2.reversestr("Sunday"));
    }
}
