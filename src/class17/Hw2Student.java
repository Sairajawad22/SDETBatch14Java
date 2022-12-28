package class17;

public class Hw2Student {
    /*
    Write a java Class Students that have a constructor which takes students name and 3
    subject grades. Inside your class also have a method to Calculate Average Grade.
     Test Student class for 5 different students with different marks. Your program should
     print an average mark of each student name. NOTE: please use different names for instance and local variables.
     */
  private String name;
  private int mathGrade;
  private int scienceGrade;
  private int historyGrade;

    public Hw2Student(String name, int mathGrade, int scienceGrade, int historyGrade) {
        this.name = name;
        this.mathGrade = mathGrade;
        this.scienceGrade = scienceGrade;
        this.historyGrade = historyGrade;
    }
    void calculateAverage(){
        int average=(mathGrade+scienceGrade+historyGrade)/3;
        System.out.println(name+ " average grade is "+ average);
    }
}
class Hw2StudentTester{

    public static void main(String[] args) {
        Hw2Student student1=new Hw2Student("Sonam",100,90,85);
        student1 .calculateAverage();
        Hw2Student student2=new Hw2Student("Bilal",80,70, 64);
        student2 .calculateAverage();
        Hw2Student student3=new Hw2Student("Ahmad",48,70,88);
        student3 .calculateAverage();
        Hw2Student student4=new Hw2Student("Sana",93,40,66);
        student4 .calculateAverage();
        Hw2Student student5=new Hw2Student("Jamal",50,70,78);
        student5 .calculateAverage();
    }
}