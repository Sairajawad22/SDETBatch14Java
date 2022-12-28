package Repils;

public class Problem_144 {
    /*
    Step 1: Complete the StoreProduct.java class:

Create below instance variables. (Choose proper datatype and naming convention for variable )

* label

* price

* category

* hasExpiration

* stock (represent the stock quantity)

Step 2: Write three constructors:

* The main constructor( with all parameters)

* Second constructor with all parameters except category and hasExpiration (category defaults to "misc", hasExpiration defaults to false inside constructor)

* Third constructor all the parameters except category, expiration, and stock (stock default to 0 inside the constructor)

Step 3: Method for display out put.

in StoreProduct Class create a method to display the output of class variables. (Output sequence as as order of variable shown above. all in one line)

Step 4: in Main Class Create an object of StoreProduct Class with each constructors.

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
//*************************Teacher solutions
        /*class Main {
    public static void main(String[] args) {
        StoreProduct obj = new StoreProduct("Eggs", 3.0, "Produce", true, 10);
        obj.display();
        StoreProduct obj1 = new StoreProduct("Paper Towels", 2.0, 24);
        obj1.display();
        StoreProduct obj2 = new StoreProduct("Paper Towels", 2.0);
        obj2.display();
    }
}
public class StoreProduct {
    String lable;
    double price;
    String category;
    boolean hasExpiration;
    int stock;
    StoreProduct(String lable, double price, String category, boolean
            hasExpiration, int stock){
        this(lable,price);
        this.category=category;
        this.hasExpiration=hasExpiration;
        this.stock=stock;
    }
    StoreProduct(String lable, double price, int stock){
        this(lable,price);
        this.stock=stock;
        this.category="misc";
        this.hasExpiration=false;
    }
    StoreProduct(String lable, double price){
        this.lable=lable;
        this.price=price;
        this.stock=0;
    }
    public void display(){
        System.out.print(lable +" "+ price +" "+ category +" "+ hasExpiration +" "+
                stock+"\n");
    }
}
*/
    /*My own
    public static void main(String [] args){
        StoreProduct storeProduct1=new StoreProduct("Eggs",3.0,"Produce",true,10);
        storeProduct1.display1();
        StoreProduct storeProduct2=new StoreProduct("Paper Towels",2.0,"misc",false,24);
        storeProduct2.display2();
        StoreProduct storeProduct3=new StoreProduct("Paper Towels",2.0,"null ",false,0);
        storeProduct3.display3();
    }
}
public class StoreProduct{
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
    public void display2(){
        System.out.println(lable +" "+ price +" "+ category +" "+ hasExpiration +" "+ stock);
    }
    StoreProduct(String lable, double price){
        this.lable=lable;
        this.price=price;
        this.stock=0;
    }
    public void display3(){
        System.out.println(lable +" "+ price +" "+ category +hasExpiration+" "+ stock);
    }
}*/
}