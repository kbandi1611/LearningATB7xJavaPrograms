package July.ex20072024;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        // Take user input and check the number is even or odd

        // Logic building
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int user_input = sc.nextInt();
        System.out.println(user_input);

        if (user_input % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
