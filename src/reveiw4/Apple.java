package reveiw4;

public class Apple extends Fruit {
    //As child class we can have our own feature and we need to initiallize it
    // by using this
    String size;
    String taste;
    double price;
    Apple(String name,String shape,String color,String size){
        super(name,shape,color);// super always has to be first
        this.size=size;
    }
Apple (String name,String shape,String color,String taste,double price){
        super(name,shape,color);
        this.taste=taste;
        this.price=price;

}
    //now we can creat our own method inside the parent class
    void makeJuice(){// this method is not available to the fruit class
        System.out.println("from"+ name+"we can make"+taste+"juice");
    }
// overloading ->methods with the same name within the same class
    /*
    How to achieve over loading?
    First, change number of parameters
    Second, change of parameters
    in overloading it looks for method signature
    in overloading method signature MUST BE DIFFERENT
    method signature=name+parameters
    we don't care about return type
     */
    void makeJuice(String fruit) {
        System.out.println("we can have juice from" + name + "mixed with"+fruit) ;
        }
        public static void main (String[]args){
            Apple app = new Apple("apple", "circle", "red", "medium");
            // app.color; not visible since it access modifire is private
            System.out.println(app.name);
            System.out.println(app.shape);
            System.out.println(Fruit.fresh);// we can access to the static through the class name
            System.out.println(Apple.fresh);

            app.grow();// from fruit class
            app.haveBenefits();//from fruit class
            app.makeJuice();// from apple class
        }
    }
