package class14;

public class HomeWork2 {
    // Create a method that will take a number and prints whether the number is even or odd.
    void oddEven(int num){
        if(num%2==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args) {
        HomeWork2 hw=new HomeWork2();
        hw.oddEven(31);
    }
}
