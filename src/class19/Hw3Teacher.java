package class19;

public class Hw3Teacher {
    /*
    Write a Java program called Teacher.  Identify features and behaviour
     of that Class. Create 3 subclasses MathTeacher, ChemistryTeacher
     and PianoTeacher that would have it their own features and behaviour. Test all 4 classes
     */
    String name;
    String subject;
    int Id;
    String department;

    public Hw3Teacher(String name, String subject, int Id, String department) {
        this.name = name;
        this.subject = subject;
        this.Id = Id;
        this.department = department;
    }

    void printInfo(){
        System.out.println(" name "+name+" subject "+subject+" id "+Id+" department "+department);

    }
}
class MathTeacher extends Hw3Teacher {
    MathTeacher(String name, String subject, int Id, String department) {
        super(name,subject,Id,department);
    }

}
class ChemistryTeacher extends Hw3Teacher{
    ChemistryTeacher(String name, String subject, int Id, String department) {
        super(name,subject,Id,department);
}
static class PianoTeacher extends Hw3Teacher{
  PianoTeacher(String name, String subject, int Id, String department) {
        super(name,subject,Id,department);
}

}
static class TestTeacher {
    public static void main(String[] args) {
        MathTeacher mathTeacher=new MathTeacher("Ms. Scallici","Math",1234,"math department");
        mathTeacher.printInfo();
        ChemistryTeacher chemistryTeacher=new ChemistryTeacher("Mr.Eric","chemistry",987762,"chemistry department");
        chemistryTeacher.printInfo();
        PianoTeacher pianoTeacher= new PianoTeacher("Miss.Carroll","piano",765567,"music department");
       pianoTeacher.printInfo();
    }
}

}