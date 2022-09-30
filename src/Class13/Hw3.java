package Class13;

public class Hw3 {
    public static void main(String[] args) {
     /*
     You have a String a= ” Is it saturday? Is it raining? Do we have a Java Class today?” How would you find out how many sentences are in that String?

      */
        String a ="Is it saturday? Is it raining?Do we have a Java Class today?";
        String [] arr=a .split("[?]");
        System.out.println("The number of the sentences are "+arr.length);

    }
}
