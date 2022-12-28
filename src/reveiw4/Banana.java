package reveiw4;

public class Banana extends Fruit{
    String origin;
    Banana(String name, String shape, String color,String origin) {
        super(name, shape, color);
        this.origin=origin;
    }
// As a child class i want to have the method grow from the parent class which i can but have to follow the rules
    /*
    we can follow the rule by
    when child class have the same method name as supper class=> we call it overriding
    overriding => when we have two or more methods with the same name BUT inside different class
     */
    /*
    how to overiding
    1. method signature (name +paramater)MUST BE THE SAME
    2. return type MUST BE SAME
    3. access modefire/visibility MUST be same or be higher
     */
    protected void grow(){
        System.out.println(name+" grow faster");

    }
    // when child class have same static method as parent class we are not achiving method overriding
    // this calls method hiding
    public static void havePeel(){
        System.out.println("banana is very easy to peel");
    }
    void makeSmothie(){
        System.out.println("from "+name+" we can make tasty smoothie");
    }
    void makePie(){
        System.out.println("banana pie is delicious");
    }
    public static void main(String[] args) {
        Banana ban=new Banana("banana","banana shape","yellow","Ecuador");
        ban.grow();//it comes from fruit class
        ban.haveBenefits();// from fruit
        ban.makeSmothie();//from banana
        ban.grow();//banana
        Banana.havePeel();// banana /we can access the static method through the class name
        System.out.println("**********************************");

       Fruit fruit =new Banana("banana","banana shape","green","Africa");
       fruit.grow();// runtime polymorphism
       fruit.haveBenefits();
    }
// note. when we have static method in the parent class and in the child class it calls method over hidding
}
