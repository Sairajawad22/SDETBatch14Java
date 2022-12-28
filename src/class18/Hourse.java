package class18;

public class Hourse extends Animal{


  public Hourse(String name,String breed,int age, double weight){
      this.name=name;
     this. breed=breed;
      this.age=age;
      this.weight=weight;
  }


    public static void main(String[] args) {
      Hourse horseObject=new Hourse("Sprit ","Stallion ",20 ,400);
      horseObject.printInfo();
    }
}
