package class20;

public class Hw4 {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.

     */
    private void add(String name, int age, int grade, String school) {
        System.out.println(name + " " + "is" + " " + age + " " + "years old" + " " + "he is in " + grade + " " + "grade" + " his school name is" +" " + school);
    }

    private void add(String name, int age, String school) {
        System.out.println(name + " " + "is" + " " + age + " " + "years old" + " " + " her school name is" +" " + school);
    }

    private void add(String name, int age) {
        System.out.println(name + " " + "is" + " " + age + " " + "years old");
    }

    public static void main(String[] args) {
   Hw4 hw4=new Hw4();
   hw4.add("Akif",3);
   hw4.add("Bial",12,7,"Brambleton middle school");
   hw4.add("Hina",11,"Medison Trust Elemintry school");


    }
}