package August.ex18082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab219 {
    public static void main(String[] args) throws FileNotFoundException {
        try{
            int a = 10/0; // Unchecked
        } catch(ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e1){
            System.out.println("E1");
        } catch(Exception e2){
            System.out.println("E2");
        } finally{
            System.out.println("Finally block executed");
        }
        FileReader f = new FileReader(new File("C:/Users/karth/Documents/I-94.pdf"));
    }
}
