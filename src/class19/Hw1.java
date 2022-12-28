package class19;

public class Hw1 {
    /*
    Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.
     */
    String name;
    String color;
    int age;
    double weight;

    public void printInfo(){
        System.out.println(" name= "+name+" color= "+color+" age= "+age+" weight= "+weight);
    }

    public Hw1(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;

    }
}
class A extends Hw1{

    A(String name, String color, int age, double weight) {
        super(name, color, age, weight);

    }
}
class B extends A{

     B(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }
}
class C extends B{

     C(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }

    public static void main(String[] args) {
        A a=new A("Rom","brown",2,10);
        a.printInfo();
       B b=new B("Cooper","white",5,15);
       b.printInfo();
       C c=new C("Tommy","black",3,11);
       c.printInfo();

    }
}