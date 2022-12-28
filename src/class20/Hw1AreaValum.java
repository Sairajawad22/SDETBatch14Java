package class20;

public class Hw1AreaValum {
    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectangle
Square
Box
     */
    void calculateArea(double length, double height) {

        System.out.println(" The are of the rectangle is " + length * height);
    }

    void calculateArea(double width, double height, double length) {

        System.out.println(" The are of the box is " + width * height * length);
    }
    void calculateArea(double length) {

        System.out.println(" The are of the square is " + length * length);
    }
}
class AreaValumTest{
    public static void main(String[] args) {
    Hw1AreaValum hw1AreaValum=new Hw1AreaValum();
    hw1AreaValum. calculateArea(2.5,3.5);
    hw1AreaValum. calculateArea(2.5);
    hw1AreaValum. calculateArea(2.5,3.5,2.4);
}
}
