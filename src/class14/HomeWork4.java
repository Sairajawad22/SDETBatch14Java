package class14;

public class HomeWork4 {
    //Create a method that will say Hello in different language based on the country that will passed when method is executed
    void countryLanguage(String sentence){
      if(sentence.equals("German"))  {
          System.out.println("guten tag");
      }else if(sentence.equals("France")){
          System.out.println("bonjour");
      }else if(sentence.equals("Spanish")) {
          System.out.println("hola");
      }else if(sentence.equals("Afganistan")) {
          System.out.println("Salam");
      }
      else{
          System.out.println("language is invalid");
      }
    }

    public static void main(String[] args) {
        HomeWork4 homework4=new HomeWork4();
        homework4.countryLanguage("Spanish");
    }
}
