package August.ex17082024;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab215 {
    public static void main(String[] args) {
        try{
            int a = 100/0;
        } catch(Exception e){
            throw new RuntimeException(e);
        }

        try{
            FileReader f = new FileReader(new File("C://a.txt"));
        } catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }

    }
}
