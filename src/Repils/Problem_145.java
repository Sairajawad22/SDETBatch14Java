package Repils;

public class Problem_145 {

        String dogName;
        double dogWeight;
        static String dogBreed="Mutt";
    Problem_145(String dogName,double dogWeight){
            this.dogName=dogName;
            this.dogWeight=dogWeight;
        }
        void Display(){
            System.out.println(dogName+" "+dogBreed+" "+dogWeight);
        }
    }
class test {
    public static void main(String[] args) {
        Problem_145 obj = new Problem_145("Tarzan", 50.0);
        Problem_145 obj1 = new Problem_145("Lucy", 10.0);
        obj.Display();
        obj1.Display();
    }
}
