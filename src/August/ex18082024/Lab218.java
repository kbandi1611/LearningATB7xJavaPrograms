package August.ex18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab218 {
    public static void main(String[] args) throws FileNotFoundException, ArithmeticException {
        readFile();
    }
    private static void readFile() throws FileNotFoundException, ArithmeticException{
        System.out.println("Hello Karthik");
        String path = "C:/Users/karth/Documents/I-94.pdf";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        System.out.println("End of the program");
    }
}
