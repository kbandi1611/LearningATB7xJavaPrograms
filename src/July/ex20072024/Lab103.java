package July.ex20072024;

import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
        //Program to check if a number is positive, negative or zero
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = sc.nextInt();

        if(num > 0) {
            System.out.println("You have entered positive number");
        } else if (num < 0) {
            System.out.println("You have entered negative number");
        } else {
            System.out.println("You have entered the number zero");
        }
    }
}
