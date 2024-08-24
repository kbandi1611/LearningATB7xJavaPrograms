package August.ex17082024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab208 {
    public static void main(String[] args) {
        //Exception
        //Checked - JVM knows
//        try{
//            FileInputStream file = new FileInputStream("C://log.txt");
//        } catch(FileNotFoundException e){
//            throw new RuntimeException(e);
//        }

        //Unchecked
        try{
            int a = 10;
            int b = a/0;
            System.out.println(b);

        }catch(Exception e){
            System.out.println("Can't divide by Zero");
        }

        System.out.println("End of the program");
    }
}
