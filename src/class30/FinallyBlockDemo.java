package class30;

public class FinallyBlockDemo {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch (ArithmeticException ae){
            System.out.println("Operation is not allowed");
        }finally {
            System.out.println("This Block always execute no matter what happen inside the try and inside the catch");
        }
    }
}
