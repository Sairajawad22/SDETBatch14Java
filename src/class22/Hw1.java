package class22;

public class Hw1 {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */
}
class Student{
    void takeQuize(){
        System.out.println("Student take the quize ");
    }
    void GoupProject(){
        System.out.println("Student do group project");
    }
    void duration(){
        System.out.println("Education duration is different");
    }
    void degree(){
        System.out.println("Students can get different degree");
    }
}
class SyntaxStudent extends Student{
    void takeQuize(){
        System.out.println("Student in Syntax take the quize twice a month");
    }
    void GoupProject(){
        System.out.println("Student in Syntax do group project once a month");
    }
    void duration(){
        System.out.println("Syntax is for six months");
    }
    void degree(){
        System.out.println("After finishing Syntax student get certificate");
    }

}
class CollegeStudent extends Student{
    void takeQuize(){
        System.out.println("Student in college take the quize every week");
    }
    void GoupProject(){
        System.out.println("Student in college do group project once in a semester");
    }
    void duration(){
        System.out.println("College is for 2 years");
    }
    void degree(){
        System.out.println("After finishing college student get associate degree");
    }

}
class schoolStudent extends Student{
    void takeQuize(){
        System.out.println("Student in school take the quize every week");
    }
    void GoupProject(){
        System.out.println("Student in school do group project once in every quarter");
    }
    void duration(){
        System.out.println("school is for 12 years");
    }
    void degree(){
        System.out.println("After finishing school student get high school diploma");
    }


}
class StudentTester{
    public static void main(String[] args) {
        Student[] students={new SyntaxStudent(),new CollegeStudent(),new schoolStudent()};

        for(Student student:students){
            student.takeQuize();
            student.GoupProject();
            student.duration();
            student.degree();
        }
    }
}