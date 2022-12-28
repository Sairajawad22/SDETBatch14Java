package myOwnRepilPractice;

public class A {
    /*
    Create three classes (A, B, C)

Write two constructors:

* Have a default constructor that prints out the following

For A:  "I"

For B: "am"

For C: "a tester"

Make C extend B

and B extend A

From your Main class create an object of the C class.

**Expected Output:**

```
I
```

```
am
```

```
a tester

     */



        int i=10;
    }
    class B extends A{
        int i=20;
        void display(){
            System.out.println(i);
            System.out.println(super.i);
        }
}
class Main8 {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }

}


