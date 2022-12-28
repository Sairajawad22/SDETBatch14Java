package review3revie2Tester;


import review3.Country;

 class USA extends Country {

     public USA(String name, String capital, int population, String president) {
         super(name, capital, population, president);
     }

     public static void main(String[] args) {

        USA usa=new USA("USA","WD",6536547,"Biden");
        usa.name="USA"; //public
        usa.capital="DC"; //protected
    }
}
