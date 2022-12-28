package class18;

public class Hw1Student {
    /*
    Write a Student class that have instance variables name and address.
     Create a constructor that will initialize those variables.
      Print name & address of given  student using displayInfo method.
     */
    String name;
    String adress;

    public Hw1Student(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }
    void displayInfo(){
        System.out.println("student name is  "+name+"and adress is "+adress);
    }

    public static void main(String[] args) {
        Hw1Student obj=new Hw1Student(" Hina ","5501 Seminary rd,VA");
        obj.displayInfo();
    }
}
