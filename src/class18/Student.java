package class18;

public class Student {

     /*
    Write a java Class Students that have a constructor which takes students name and 3
    subject grades. Inside your class also have a method to Calculate Average Grade.
     Test Student class for 5 different students with different marks. Your program should
     print an average mark of each student name. NOTE: please use different names for instance and local variables.
     */
    String name;
    double subj1;
    double subj2;
    double subj3;
    Student(String studentName, double studentSubj1, double studentSubj2, double studentSubj3){
        name= studentName;
        subj1=studentSubj1;
       subj2=studentSubj2;
       subj3=studentSubj3;
    }
    void calculatePrintAvaGrade(){

        System.out.println(name+" "+(subj1+subj2+subj3)/3);
    }

    public static void main(String[] args) {
        new Student("Sabah",99,98,97).calculatePrintAvaGrade();
    }
}
