package review5;
final class Drink{
    String str;

    void drink(){
        System.out.println("drinking method");
    }

    // final method can not be override
   protected final void enjoy(){
        System.out.println("we enjoy drinking water");
    }

}

//public class Juice extends Drink {
    /* CE: Cannot overide the final method from drink
     public void enjoy(){
        System.out.println("we enjoy drinking juice");
    }*/

