package Repils;

public class Task138 {
/*
For you to do:

In AnotherClass declare a private, default, protected, public methods and have them each return the name of the what access modifier they are using.

All methods should be accessible by class name

Call methods of Another class inside Main class

**Expected Output:**

```
default
```

```
protected
```

```
public
```
 */
        private String myMethod1() {
            final String aPrivate = "private";
            return aPrivate;
        }
        String myMethod2() {
            final String aDefault = "default";
            return aDefault;
        }
        protected String myMethod3() {
            final String aProtected = "protected";
            return aProtected;
        }
        public String myMethod4() {
            final String aPublic = "public";
            return aPublic;
        }
    }
    class main {
        public static void main(String[] args) {
            Task138 obj = new  Task138();
            System.out.println(obj.myMethod2());
            System.out.println(obj.myMethod3());
            System.out.println(obj.myMethod4());
        }
    }

