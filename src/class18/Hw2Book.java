package class18;

public class Hw2Book {
   /* Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
    Instance variables are being initialized
    Both Constructors are being executed*/
    String name;
    String author;
    String title;
    int year;

    public Hw2Book(String name, String author) {
        this.name = name;
        this.author = author;
        System.out.println("book name is "+ name+"and the author is "+author);
    }

    public Hw2Book(String title, int year) {
        this.title = title;
        this.year = year;
        System.out.println("book title is "+title+"and publish year is "+ year);



    }

    public static void main(String[] args) {
        Hw2Book obj=new Hw2Book("Bad Guys ","Aarun Blabey");

        Hw2Book obj1=new Hw2Book("the bad guy ",2021);

    }
}
