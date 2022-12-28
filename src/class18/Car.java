package class18;

public class Car{
    // common class has mony different names like parents, super,and base
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;
    // if a field or method has private acces modifier in parent class child classes can not use it.

    void printCarDetails(){
        System.out.println(" Model "+model+" make "+make+" color "+color);
    }
}

 class BMW extends Car{// child classes
    double engineCC;

}

class Tesla extends Car{// second class should not include public because only the first one should have public

}
class Toyota extends Car{
    double engineCC;
}
class CarTester{
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.model="X8";
        bmw.make="BMW";
        bmw.color="black";
        bmw.engineCC=200;
        bmw.printCarDetails();
    }

}