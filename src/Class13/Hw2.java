package Class13;

public class Hw2 {
    public static void main(String[] args) {
      /*
      Create a String that should be combination of letters, numbers and special characters.
       Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
       */
        String str="ADGDHHsdtehv123876@!3456";
        str=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("str = " + str);
        System.out.println("There are "+str.length()+" Alphanumeric characters in the letter");
    }
}
