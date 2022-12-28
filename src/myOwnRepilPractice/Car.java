package myOwnRepilPractice;

/*
 make

* model

* numberOfDoors

* topSpeed

* price

following the proper naming convention for variables.

Write four constructors:

* The first constructor(with all parameters)

* A secondary constructor Have all parameters **except numberOfDoors. (**numberOfDoors value should assign to 4 inside constructor)

* A third constructor Have all parameters **except make and model .** **(**make and model value should assign to "unknown" inside constructor)

* A fourth constructor Have all parameters **except topSpeed and price**;**(**topSpeed value should assign to "90" and price value should be assign to 0 inside constructor)

Create a display method in Cars class to print the class variable value in console.

2. Test your code with the Main.java class:

Create several Car objects using all Constructors.

then call display method with each object.

Output:

```
Toyota Prius 4 120 30000.0
Toyota Prius 4 120 30000.0
unknown unknown 4 120 30000.0
Toyota Prius 4 90 0.0
```
 */
public class Car {
    String make;

    String model;

    int numberOfDoors;

    int topSpeed;

    double price;

    public Car(String make, String model, int numberOfDoors, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    void display1() {
        System.out.println(make + " "+model +" "+ numberOfDoors +" "+ topSpeed +" "+ price);
    }

    public Car(String make, String model, int topSpeed, double price) {
        this.make = make;
        this.model = model;
        this.topSpeed = topSpeed;
        this.price = price;
    }

    void display2() {
        System.out.println(make + " "+ model + " "+ topSpeed + " "+ price);
    }

    public Car(int numberOfDoors, int topSpeed, double price) {
        this.numberOfDoors = numberOfDoors;
        this.topSpeed = topSpeed;
        this.price = price;
    }

void display3(){
    System.out.println(numberOfDoors+ " "+topSpeed+ " "+price);
    }

    public Car(String make, String model, int numberOfDoors) {
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }
    void display4(){
        System.out.println(make+ " "+model+ " "+numberOfDoors);
    }
}
class Main{
    public static void main(String[] args) {
        Car car1=new Car("Toyota","Prius ",4,120,30000.0);
        car1.display1();
       Car car2=new Car("Toyota","Prius ",4,120,30000.0);
       car2.display2();
        Car car3=new Car("unknown","unknown",4,120,30000.0);
        car3.display3();
        Car car4=new Car("Toyota","Prius",4,90,0.0);
        car4.display4();
    }
        }

