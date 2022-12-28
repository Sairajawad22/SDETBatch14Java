package review3;

public class Country {
    public String name;
    protected String capital;
    int population;
    private String president;

    public Country(String name, String capital, int population, String president) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.president = president;
    }

    Country(String name){
        this.name=name;
    }
}
