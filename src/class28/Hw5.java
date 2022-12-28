package class28;

import java.util.HashMap;

public class Hw5 {
    /*
    Create a Map that will store Employee name and salary. Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
John Smith=$100000
     */
    public static void main(String[] args) {
        HashMap< String,Integer>employee = new HashMap<>();
        employee.put("Bilal Jawad",60000);
        employee.put("Hina Jawad",30000);
        employee.put("Lais Raz",42000);
        employee.put("Hasina Sakhi",8000);
        employee.put("Meraj Raz ",12000);
        employee.put("Ismail lal",6000);
       var salaryValue = employee.values();
        int maxSalary=0;
        String maxKey="";
        for (var value:salaryValue) {
            if(value>maxSalary){
              maxSalary=value;
            }
        }
   var ent =employee.entrySet();
        for(var item:ent ){
           if(item.setValue(maxSalary) ==maxSalary){
              maxKey=item.getKey();
           }
        }
        System.out.println(maxKey+"=$"+maxSalary);
    }
}