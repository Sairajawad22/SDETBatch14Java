package review5;

public class Test {
    public static void main(String[] args) {
       Car car =new Tesla("Tesla","X","Yellow");
       car.drive();
       car.start();
       car.stop();
        //tesla.charge(); can not use
       Tesla tesla =new Tesla("Tesla","X","Green");
        tesla.drive();
        tesla.start();
        tesla.stop();
        tesla.charge();
        // new Car(); we can not create object of car class because it abstarct
        // which mean it is incomplete
    }
}
