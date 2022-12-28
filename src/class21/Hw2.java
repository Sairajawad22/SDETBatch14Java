package class21;

public class Hw2 {
    /*
    Create a class CreditCard and define variable balance and interest. Create an instance method
    that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.

     */
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        creditCard.calculateInterestRate(2000);
        Visa visa=new Visa();
        visa.calculateInterestRate(3000);
        AX ax=new AX();
        ax .calculateInterestRate(1000);


    }

}
class CreditCard{
    double balance;
    double inetrest;

   void calculateInterestRate(double balance) {
       System.out.println("The interest amount is "+balance*0.08);
   }

}
class Visa extends CreditCard{

}
class AX extends CreditCard{
    void calculateInterestRate(double balance) {
        System.out.println("With AX the interest amount is "+balance*0.04);
    }

}