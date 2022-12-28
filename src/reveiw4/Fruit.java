package reveiw4;

public class Fruit {
    protected String name;
    String shape;
   private String color;// we have 3 instance variable
    static boolean fresh;// we have one static variable

   public Fruit(String name){

       this.name=name;
    }// our constructor initialize our instance variable
    Fruit(String name,String shape,String color){
       this(name);//when we are in the same class and we call a constructor from another constructor we have to use this.() and it should be use first
       this.shape=shape;
       this.color=color;
    }
   void grow(){

       System.out.println("All frout grow fresh"+fresh);
    }// we have two methods
    public static void havePeel(){
        System.out.println("All fruits must be peeled");
    }
  protected void haveBenefits(){

       System.out.println("All fruits good for your health");
    }
}
