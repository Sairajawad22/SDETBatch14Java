package class30;

public class TryCatchDEmo {
    public static void main(String[] args) {
     try{
     doSomeThing();
     }catch( NullPointerException npe){
         System.out.println("Got null pointer exception");
}
     catch( IndexOutOfBoundsException e){
         System.out.println("Got Index out of bound this time");
     }
     catch (NegativeArraySizeException e){
         System.out.println("Josh can't create arrays with negative size");
     }
     catch (ArithmeticException e){
         System.out.println("This operation is not supported by java");
     }
     catch (Exception e){
         System.out.println("I can handle any type of exceptions");
     }
    }

    public static void doSomeThing() {
       String name = null;
        System.out.println(name.length());
        /*int arr []=new int[1];
        System.out.println(arr[10]);
        String str="gfgdfruk";
        str.charAt(20);
        System.out.println(101/0);*/
    }
}