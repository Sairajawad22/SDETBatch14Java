package class17;

public class Hw3PersonConstructor {
    /*
    Write a java class that have 4 constructors with 4 different access
    levels of constructors(private,public,default,protected) and create
    4 objects of this class: 1 - inside same class; 2 - from outside the class;
    3 - from different class inside different package  and observe result.
     */
     String fname;
     String lname;
     String religion;
     int age;
     String job;
     char gander;
     int salary;

    Hw3PersonConstructor(){
     }
     public Hw3PersonConstructor(String newFname,String newlname){
     fname=newFname;
     lname=newlname;
     }
     private Hw3PersonConstructor(String newReligion,int newAge){
        religion=newReligion;
        age=newAge;
     }
     protected Hw3PersonConstructor(String newJob, char newGander){
        job=newJob;
        gander=newGander;

     }

    public static void main(String[] args) {
        Hw3PersonConstructor obj=new Hw3PersonConstructor("Bilal","Jawad");
        Hw3PersonConstructor obj1=new Hw3PersonConstructor("muslim",12);
        Hw3PersonConstructor obj2=new Hw3PersonConstructor("student",'F');
        Hw3PersonConstructor obj4=new Hw3PersonConstructor();
    }
    }


