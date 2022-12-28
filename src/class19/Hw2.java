package class19;

public class Hw2 {
    /*
    Write program to inherit class A that has method printF which is static and call or reuse that method into class B
     */
}
class Aa extends Hw2 {
    static void printF(){
        System.out.println("This is the parent class");
    }
}
class Bb extends Aa{
    public static void main(String[] args) {
        Bb b =new Bb();
        b.printF();
    }
}