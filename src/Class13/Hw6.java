package Class13;

public class Hw6 {
    /*
       How would you swap  2 strings without a temporary variable?
     */
    public static void main(String[] args) {

        String a = "study";
        String b = "hard";
        System.out.println("Before swap: " + a + " " + b);
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("After : " + a + " " + b);
        System.out.println("-------------------");// another way
        String str1="Python";
        String str2="Java";
       str1=str1 + str2;
       str2=str1.replace(str2,"");
       str1=str1.replace(str2,"");
        System.out.println(str1);
        System.out.println(str2);
    }
}
