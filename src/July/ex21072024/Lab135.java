package July.ex21072024;

import java.sql.SQLOutput;

public class Lab135 {
    public static void main(String[] args) {
        // Functions
        //Block of code which we can re-use
        //1. Pre-built - Math.max()
        // User created/defined

        // Two components of the function
        //1. Define
        //2. Call the function

        //Call the function
        for(int i = 0; i < 10; i ++) {
            greet();
        }
        greet2();
    }

    static void greet(){
        System.out.println("Hi, How are you?");
    }
    static void greet2(){
        System.out.println("Hope you are doing good!!");
    }
}
