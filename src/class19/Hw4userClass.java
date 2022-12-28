package class19;

import static class19.UserInfo.adress;

public class Hw4userClass {
    /*
    Write program: userClass  that has a constructor that initializes
    instance variable name and mobile number. Create a subclass  userInfo that
    will have user address variable and it also being initialized through constructor call.
    Print users name, mobile number and address in userDetails method. Test your code.
     */
    String name;
    int mobileNumber;

    void userDetails(){
        System.out.println("User name is "+name+" his mobile number is "+mobileNumber+" and his adress is "+adress);
    }

    public Hw4userClass(String name, int mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}
class UserInfo extends Hw4userClass{
    static String adress;

    public UserInfo(String name, int mobileNumber, String adress) {
        super(name, mobileNumber);
        this.adress=adress;
    }
}
class Testing {
    public static void main(String[] args) {
      UserInfo obj=new UserInfo("Ahmed",1263397678,"5501 Seminary rd,");
      obj.userDetails();
    }
}