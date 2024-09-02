package August.ex18082024;

import java.util.Scanner;

public class Lab222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        try{
            if(x == 0){
                throw new ArithmeticException("Enter non-zero value");
            }
            float a = 10/x;
            System.out.println(a);
        } catch(ArithmeticException e){
            throw new RuntimeException(e);
        }
    }
}
