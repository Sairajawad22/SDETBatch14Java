package class17;

public class Hw1CarTester {
    public static void main(String[] args) {
        Hw1Car task=new Hw1Car("BMW","red",2022);
        task.printInfo();
        System.out.println("******************************");
        Hw1Car task2=new Hw1Car();
        task2.printInfo();
    }
}
