package class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        Right click on your file and click copypathreference then click from Content root
         */
     var path="Data/config.properties";// 1) The location of the file
       var fileInputStream=new FileInputStream(path);// 2) It helps us Navigate to the file
        var properties=new Properties();// properties is a  software that helps us Navigate to the file
        properties.load(fileInputStream);// load inside(Memory). This load doads all data from the file to Java program
        System.out.println(properties.getProperty("URl"));
        System.out.println(properties.getProperty("password"));
        fileInputStream.close(); // close the file


    }
}
