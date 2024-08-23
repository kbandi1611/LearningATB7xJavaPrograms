package July.ex21072024;

import java.util.Scanner;

public class Lab136 {
    public static void main(String[] args) {
        // Functions
        // Block of code which we can reuse.
        // 1. Pre-built - Math.max()
        // 2. User created / defined

        // Two component of the functions
        // 1. Define
        // 2. Call the function

        //  1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4. With Parameters and With Return Type

        function_type_1();
        System.out.println("-----------------------------------");

        String name = funtion_type_2();
        System.out.println(name);
        System.out.println("-----------------------------------");

        function_type_3("Kumar");
        function_type_3("123");
        System.out.println("-----------------------------------");

//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
        int sum_result = funtion_type_4(4,5);
        System.out.println("O/P -> " + sum_result);

    }
    static void function_type_1(){
        System.out.println("1. Without parameters and without Return Type");
    }
    static String funtion_type_2() {
        System.out.println("2. Without parameters but with Return type");
        return "Karthik";
    }
    static void function_type_3(String name){
        System.out.println("3. With parameters and without return type");
        System.out.println("You have shared -> " + name);
    }
    static int funtion_type_4(int a,  int b) {
        System.out.println("4. With parameters and with return type");
        return a + b;

    }
}
