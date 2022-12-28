package Repils;

public class Problem_148 {
    /*
    **In ShoppingStore class:**

Create variables as below.

- item,
- price,
- quantity

Create a constructor to initialize instance variables.

Create a method with name itemTotalPrice.

write a logic to to calculate the total values of items in stock. and print the result.

return the total value.

**In Main Class.**

Create two Object of ShoppingStore and pass the parameters to Constructor.

then using each object call the method itemTotalPrice.

Store the returned value of each object.

Calculate sum of both object and print the result.

Output:

```
Blanket Total Value 99.98
```

```
Mattress Total Value 439.18
```

```
You purchased 539.16 Today
```

```
Assignment Goals: Clean Code, proper naming convention, Choosing Variable Datatype,  This Keyword, Method Creation, Mathematic Operations, method return types.
```

     */
    // solotion below
   /* class Main {
   public static void main(String[] args){
        ShoppingStore item1=new ShoppingStore("Blanket",49.99,2);
        ShoppingStore item2=new ShoppingStore("Mattress",439.18,1);
        double item1Price = item1.itemTotalPrice();
        System.out.println(item1+" Total Value "+item1Price);
        double item2Price = item2.itemTotalPrice();
        System.out.println(item1+" Total Value "+item2Price);
        System.out.println("You purchased "+item1Price+item2Price+" Today");
    }

}
public class ShoppingStore {
    String item;
    double price;
    int quantity;
    ShoppingStore(String item,double price,int quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }
    double itemTotalPrice(){
        return price*price;
    }*/
}