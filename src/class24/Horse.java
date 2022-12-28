package class24;

public class Horse {
    /*
    Creat a horse have 5 fields of your choice
    create constructor and getter setter methods for this class
    atleast write one condition inside setter class
     */
    private String name;
    private String breed;
    private int age;
    private double weight;
    private String color;
// by holding down the option button and mouse we can create 5 times at once in virticle way
    public Horse(String name, String breed, int age, double weight, String color) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weight);
        setColor(color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

            if (name.isEmpty()) {
                System.out.println("Name can't be empty Please try again");

            } else {
                this.name = name;
            }
    }

    public String getBreed() {
        if(name.equals("Josh")){
            return " Not allowed";
        }else {
            return breed;
        }

    }

    public void setBreed(String breed) {
        this.breed = breed;
        if (breed.isEmpty()) {
            System.out.println("Breed can't be empty Please try again");

        } else {
            this.breed = breed;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        if (color.isEmpty()) {
            System.out.println("Name can't be empty Please try again");

        } else {
            this.color = color;
        }
    }
    void display(){
        System.out.println(name+" name "+breed+" breed "+age+" age "+weight+" weight "+color+" color ");
    }
}
class Tester{
    public static void main(String[] args) {
        Horse bella=new Horse("Bella","Arabian",25,300,"brown");
        bella.display();
        System.out.println(bella.getName());

    }
}
