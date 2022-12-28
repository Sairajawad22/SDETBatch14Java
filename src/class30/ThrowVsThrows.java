package class30;

import utils.ExcelReader;

import java.io.IOException;

public class ThrowVsThrows {
    public static void main(String[] args) throws IOException {
        method2();
    }
        public static void method1() {
            System.out.println(ExcelReader.read("Data/Test.xlsx"));
        }
    public static void method2() throws IOException {
        method1();
    }
}
