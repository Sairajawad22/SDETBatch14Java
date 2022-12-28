package Repils;

public class Problem_150 {
    /*
     Create four classes (Person, Employee, Student, Retiree)

* Have properties

For Person: name(String)

For Person: lastName(String)

For Person: age(int)

For Employee: salary(int)

For Student: grade(int)

For Retiree: seniorActivity(String)

At Employee, Student, Retiree Class have a print method in each that prints the properties in line as shown in the output

Create multilevel inheritance: Person --> Employee --> Student --> Retiree

From your Main class create objects of the Employee, Student and Retiree classes and call the print method.

**Expected Output:**

```
Joe Smith 35 35000
Adam Smith 15 10
Frank Smith 15 tour
```
     */

        public static void main(String[] args) {
            employee emp = new employee("Joe", "Smith", 35, 35000);
            emp.print();
            Student st = new Student("Adam", "Smith", 15, 10);
            st.print();
            Retiree ret = new Retiree("Frank", "Smith", 15, "tour");
            ret.print();
        }
    }
    class Person {
        String name;
        String lastName;
        int age;
        Person(String name, String lastName, int age) {
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }
    }
    class employee extends Person {
        int salary;
        employee(String name, String lastName, int age, int salary) {
            super(name, lastName, age);
            this.salary = salary;
        }
        employee(String name, String lastName, int age) {
            super(name, lastName, age);
        }
        void print() {
            System.out.println(name + " " + lastName + " " + age + " " + salary);
        }
    }
    class Student extends employee {
        int grade;
        Student(String name, String lastName, int age, int grade) {
            super(name, lastName, age);
            this.grade = grade;
        }
        Student(String name, String lastName, int age) {
            super(name, lastName, age);
        }
        void print() {
            System.out.println(name + " " + lastName + " " + age + " " + grade);
        }
    }
    class Retiree extends Student {
        String seniorActivity;
        Retiree(String name, String lastName, int age, String seniorActivity) {
            super(name, lastName, age);
            this.seniorActivity = seniorActivity;
        }
        void print() {
            System.out.println(name + " " + lastName + " " + age + " " +
                    seniorActivity);
        }

}
