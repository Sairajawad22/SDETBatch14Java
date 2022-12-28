package class19;

public class Animal {
    String name;
    String breed;
    String color;

    public Animal(String name, String breed, String color) {
        this.name = name;
        this.breed = breed;
        this.color = color;
    }

    public void printInfo(){
        System.out.println("name"+name+"breed"+breed+"color"+color);

    }
}
