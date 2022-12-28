package class16;

public class Hw1 {
    /*
    Create a method that will accept an array as parameters and
    will return a sum of all elements from that array. Method should be visibly only
     within same package and accessible by the creating an instance of the class.
     */
 int sumOffEllementsArray (int[] array){
    int sum=0;
    for(int i=0; i<array.length; i++){
        sum+=array[i];
    }

     return sum;
 }

    public static void main(String[] args) {
        Hw1 obj=new Hw1();
        System.out.println("Sum of all elements in the array = "+obj.sumOffEllementsArray(new int []{10,10,10}));
    }
}
