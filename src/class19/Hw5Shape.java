package class19;

public class Hw5Shape {
    /*
    Write program: Shape class has a constructor that takes the radius and has
     a subclass as  circle class. In circle class create a method to calculate
      the area of circle. Test your code
     */
   double raduis;
    public Hw5Shape(double raduis) {
        this.raduis = raduis;
    }
}
 class Circle extends Hw5Shape {
     Circle(double raduis) {
         super(raduis);
     }

     void printCalculate() {
         double area;
         area = 6.2 * raduis * raduis;
         System.out.println("the area of the circle is " + area);
     }
 }
class ttest{
    public static void main(String[] args) {
      Circle circle=new Circle(2);
      circle.printCalculate();
    }
}