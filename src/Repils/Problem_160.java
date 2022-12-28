package Repils;

public class Problem_160 {
    /*
    For you to do:

Overload instance method display by having different types of parameters

Inside each method write the logic to print value of the parameter

Call all methods inside your main method

**Expected Output:**

```
100
```

```
Syntax Technologies
```

```
100.09
```


     */

        static void display(int num){
            System.out.println(num);
        }
        static void display(String myString){
            System.out.println(myString);
        }
        static void display(double num){
            System.out.println(num);
        }
        public static void main(String[] args){
            display(100);
            display("Syntax Technologies");
            display(100.09);
        }
    }


