package class14;

public class HomeWork3 {
    //Create a method that will print whether given String is palindrome or not.
    void palindrome(String str){
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
       String name =stringBuilder.toString();
       if(str.equals(name)){
           System.out.println( name+ " name is palindrom");
       }else{
           System.out.println(name + " name is not palindrom");
       }
    }

    public static void main(String[] args) {
        HomeWork3 hw=new HomeWork3();
        hw.palindrome("anna");
    }
}
