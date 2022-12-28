package class28;

public class PersonHw4 {

    /*
            Create a Person class with following private fields: name, lastName, age, salary.
        Variables should be initialized through constructor.
        Inside the class also create a method to print user details.
        In Test Class create a Map that will store key in ascending order.
        In that map store personId and a Person Object. Print each object details.
             */
   private String name;
    private String lastName;
    private int age;
    private double salary;

    public PersonHw4(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }
    void printInfo(){
        System.out.println("name "+name+" "+"last name "+lastName+" "+"age "+age+" "+"salary "+salary);
    }

    @Override
    public String toString() {
        return "PersonHw4{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
