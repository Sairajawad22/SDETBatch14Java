package myOwnRepilPractice;
/*
in Main Class Create an object of StoreProduct Class with each constructors.

pass the values and then call the display method.

Step 5: Execute your application :)

Hint: each variable must be object specific

Output:



```
Eggs 3.0 Produce true 10
Paper Towels 2.0 misc false 24
Paper Towels 2.0 null false 0
```
 */
public class StoreProduct {

        String lable;
        double price;
        String category;
        boolean hasExpiration;
        int stock;

        StoreProduct(String lable, double price, String category, boolean hasExpiration, int stock){
            this.lable=lable;
            this.price=price;
            this.category=category;
            this.hasExpiration=hasExpiration;
            this.stock=stock;
        }
    public void display1(){
        System.out.println(lable +" "+ price +" "+ category +" "+ hasExpiration +" "+ stock);
    }
        StoreProduct(String lable, double price, int stock){
            this.lable=lable;
            this.price=price;
            this.stock=stock;
            this.category="misc";
            this.hasExpiration=false;
        }

        StoreProduct(String lable, double price){
            this.lable=lable;
            this.price=price;
            this.stock=0;
        }

    }

class Main1{
    public static void main(String[] args) {
      StoreProduct storeProduct1=new StoreProduct("Egg",3.0,"Produce",true,10);
      storeProduct1.display1();
        StoreProduct storeProduct2=new StoreProduct("Paper Towel",2.0,"misc",false,24);
        storeProduct2.display1();
        StoreProduct storeProduct3=new StoreProduct("Paper Towel",2.0,"null ",false,0);
        storeProduct3.display1();
    }
}