package myOwnRepilPractice;
class Main9 {
    public static void main(String[] args) {
        Child child =new Child("Fairfax");
        child.display();
    }
}
public class Parent {
    String city;

    public Parent(String city) {
        this.city = city;
    }
    void display(){
        System.out.println("City name "+city);
    }
}
class Child extends Parent{

    public Child(String city) {
        super(city);
    }
}

