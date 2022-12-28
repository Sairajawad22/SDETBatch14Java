package class29;

import utils.ExcelReader;

import java.io.IOException;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String path="/Users/sairajawad/IdeaProjects/SDETBatch14Java/Data/Book.xlsx";
      var data  =ExcelReader.read(path);
        /*Map<String ,String>row1=data.get(0);
        System.out.println(row1.get("Name"));*/
      /*  for(var row:data){
            System.out.println(row);
        }*/
        System.out.println(data);
    }
}
