package Repils;

public class Problem_142 {
    /*
    **1. Complete the SyntaxTechnologies class:**

Include the following class variables:

* schoolName(String)

* batch(int)

* year(int)

* lastDayOfClass(String)

Write two constructors:

* non-argument constructor

* parameterized constructor

Create method to display values of instance variables.

**2. In Main Class:**

Create two different objects of the SyntaxTechnologies class using both constructors and call display method.

**Expected Output:**

```
null 0 0 null
```

```
Syntax 6 2020 07/30/2020
     */

        public static void main(String[] args) {
            SyntaxTechnologies obj1 = new SyntaxTechnologies();
            obj1.display();
            SyntaxTechnologies obj2 = new SyntaxTechnologies("Syntax", 6, 2020,
                    "07/30/2020");
            obj2.display();
        }
    }

class SyntaxTechnologies {// in repil it had public
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;
    SyntaxTechnologies() {
        schoolName=null;
        batch=0;
        year=0;
        lastDayOfClass=null;
    }
    SyntaxTechnologies(String schoolName,int batch,int year,String lastDayOfClass){
        this.schoolName=schoolName;
        this.batch=batch;
        this.year=year;
        this.lastDayOfClass=lastDayOfClass;
    }
    void display(){
        System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
    }
}