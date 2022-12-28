package class18;

public class ThisKeywordDemo {
    String str="Red";

    void print(){
        String str="Blue";
        System.out.println(this.str);// instance var
        System.out.println(str);// local var (java always prefer local var first)
    }

    public static void main(String[] args) {
        new ThisKeywordDemo().print();
    }
}
