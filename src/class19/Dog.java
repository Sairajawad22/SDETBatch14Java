package class19;

public class Dog extends Animal {// dog class has three fields


    public Dog(String name, String breed, String color) {
        super(name, breed, color);
    }



}
class Cat extends Animal{


   Cat(String name, String breed, String color) {
       super(name, breed, color);
    }
   // to void repitation we should creat another class
}
class TestAnimal{
    public static void main(String[] args) {
        Dog dog=new Dog("Jacky","German","Black");
        dog.printInfo();
    }

}