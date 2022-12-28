package reviewClass13;

import java.util.HashMap;
import java.util.Map;

public class reviewclass13 {
    public static void main(String[] args) {

        //Break till 9:10
        String str="bdfjhdfbewqbcnsdfsdf";

        System.out.println(getCount(str));
    }

    public static Map<Character,Integer> getCount(String str){
        char[] charArr=str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char niazi:charArr){

            if(map.get(niazi)==null){
                map.put(niazi,1);
            }else{
                int count=map.get(niazi);
                count=count+1;
                map.put(niazi,count);
            }
        }

        return map;
    }
}
