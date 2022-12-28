package class14;

public class HomeWork5 {
    /*Create a method createEmail(). Based on values of users name,
     lastName and email type, your method should return complete email Address.
      Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */
    String creatEmailAdress(String name,String lastName,String typeOfEmail){
        String creatEmailAdress= name+lastName+"@"+typeOfEmail+".com";
        return creatEmailAdress;
    }

    public static void main(String[] args) {
        HomeWork5 hw=new HomeWork5();
        System.out.println(hw.creatEmailAdress("John","Snow","gmail"));
    }
    }


