package Repils;

public class Main {
   // Repil 136
    /*
    Please create methods with different access modifiers (one for each access modifier) and call them properly in main method one by one

In each method write the logic accordingly like for private method write the logic in the println Statement as "This is Private Method"
 accordingly for rest of the methods that have different access modifiers should be a total of 4 outputs,
  please make sure they are in the same order that is printed below.

**Expected Output:**

This is Private Method

This is Default Method

This is Protected Method

This is Public Method

     */
    private static void privateMethod() {
        System.out.println("This is Private Method");
    }
    void defaultMethod() {
        System.out.println("This is Default Method");
    }
    protected static void protectedMethod() {
        System.out.println("This is Protected Method");
    }
    public void publicMethod() {
        System.out.println("This is Public Method");
    }
    public static void main(String[] args) {
        Main obj = new Main();
        privateMethod();
        obj.defaultMethod();
        protectedMethod();
        obj.publicMethod();
    }
}
