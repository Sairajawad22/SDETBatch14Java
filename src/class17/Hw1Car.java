package class17;

public class Hw1Car {
    /*
    Write a java class that will have a constructor: one with parameters
    and second without any parameters. Create a separate Test class where you
    will execute both of the constructors 1 by 1.
     */
    String name;
    String color;
    int model;

    public Hw1Car(String name, String color, int model) {
        this.name = name;
        this.color = color;
        this.model = model;
    }
    Hw1Car(){

    }
    void printInfo(){
        System.out.println(name+" "+color+" "+model);
    }
}

