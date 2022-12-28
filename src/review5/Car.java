package review5;
interface Drivable{
    // by default all variable public static final
    boolean DRIVES=true;
    // Inside the interface class we cannot have a constructor/no instace vairiable/ can't creat the object
    // by default all methods are public abstract in interface class
    void breaks();

}
interface Vehicle{
    void haveMotor();
    // from java 8 we can have static and default methods
    default void haveBreak(){
        System.out.println("All vehicle have break");
    }
    static void honk(){
        System.out.println("all vehicles honk");
    }
}
// with help of abstract class we can achieve 0 to 100% abstraction
public abstract class Car {
    String color,make,model;// instance variable
    public static final int WHEELS=4;
   public Car (String make, String model,String color){
       this.make=make;
       this.model=model;
       this.color=color;
   }
   void drive(){// implemented method
       System.out.println(" All car can drive");
   }
   abstract void start();// unimplemented method
   abstract void stop();
}
class Tesla extends Car implements Drivable,Vehicle{
    Tesla(String make, String model,String color){
        super(make,model,color);
    }

    @Override
    public void start() {
        System.out.println(make+" starts automatically");
    }

    @Override
   public void stop() {
        System.out.println(make+" stops when we press break");
    }
    public void charge(){
        System.out.println("You need to charge "+make);
    }

    @Override
    public void breaks() {
        System.out.println(make+" Can break");
    }

    @Override
    public void haveMotor() {
        System.out.println(make+" Have motor");
    }
   public void haveBreak(){
       System.out.println("all cars have a break");
   }

}
