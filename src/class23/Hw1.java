package class23;

public class Hw1 {
    /*
    Create a class File that will have the following behaviors: open,
    edit, close. Edit and close are implemented method while open is an
    abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will
     provide specific implementation of open behaviour: Example: to open .
     java file we need notepad++ or sublime text, to open .doc file we need Microsoft Word to be installed etc
     */

}
abstract class File{
    abstract void open() ;
    void edit(){
        System.out.println("Editing the file ");
    }
     void close(){
         System.out.println("Closing the file ");
     }

}
class JavaFile extends File{
    @Override
    void open() {
        System.out.println("to open java file we need notepad++");
    }
}
class  WordFile extends File{
    void open(){
        System.out.println("to open doc file we need Microsoft Word to be installed");
    }
}
class PdfFile extends File{
    @Override
    void open() {
        System.out.println("to open pdf file we need pdf file uploaded ");
    }
}
class FileTeser{
    public static void main(String[] args) {
        File[] file={new JavaFile(),new WordFile(),new PdfFile()};
        for (File files:file)
            files.open();
        {

        }
    }
}