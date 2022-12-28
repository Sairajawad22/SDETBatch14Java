package class30;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        try{
            String name=null;
            //System.out.println(name.length()); // Line that contains issues
            System.out.println("Code in the try block");
            // when we are not sure which types of exception our code will throw, we should use Exception e
            // because it parents and all exception inherit from it
        }catch(Exception e){// e is variable we can put any name
            System.out.println("Send an email to the developers that your application has some kinda of issue");
        }

        System.out.println("some important line of code 1");
        System.out.println("some important line of code 2");
        System.out.println("some important line of code 3");
        System.out.println("some important line of code 4");



        System.out.println("some important line of code 5");
        System.out.println("some important line of code 6");
        System.out.println("some important line of code 7");
        System.out.println("some important line of code 8");

    }
}
