package Class13;

public class Hw2 {
    public static void main(String[] args) {
      /*
      Create a String that should be combination of letters, numbers and special characters.
       Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
       */
        String str1="ADGDHHsdtehv123876@!3456";
       String str2=str1.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("There are "+str2.length()+" Alphanumeric characters in the letter");
    }
}
