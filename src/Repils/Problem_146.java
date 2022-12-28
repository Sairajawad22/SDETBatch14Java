package Repils;

public class Problem_146 {
    /*
     Complete the Employee.java class:

Include the following class variables:

* name(String)

* lastName(String)

* employeeId(int)

* startDate(String)

* salary(int)

Write two constructors:

* non-argument constructor

* parameterized constructor that will initialize all instance variables

Create two different objects of the Employee class using both constructors and print the values of the properties inline using a print method.

Output:



```
null null 0 null 0
```

```
Joe Smith 12345 01/01/1970 35000
```
     */
    public static void main(String[] args) {
        Worker obj = new Worker();
        Worker obj1 = new Worker("Joe", "Smith", 12345, "01/01/1970", 35000);
        obj.Display();
        obj1.Display();
    }

}
class Worker{

    String name;
    String lastName;
    int employeeId;
    String startDate;
    int salary;
    Worker(){
        name=null;
        lastName=null;
        employeeId=0;
        startDate=null;
        salary=0;
    }
    Worker(String name,String lastName,int employeeId,String startDate,int
            salary){
        this.name=name;
        this.lastName=lastName;
        this.employeeId=employeeId;
        this.startDate=startDate;
        this.salary=salary;
    }
    void Display(){
        System.out.println(name+" "+lastName+" "+employeeId+" "+startDate+" "+salary);
    }
}