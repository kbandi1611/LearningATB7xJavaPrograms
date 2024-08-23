package July.ex20072024;

import java.util.Scanner;

public class Lab104 {
    public static void main(String[] args) {
        //Program to find the largest among three numbers
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the num2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the num3: ");
        int num3 = sc.nextInt();

        if ((num1 > num2) && (num1 > num3)) {
            System.out.println("Number1 is the greatest");
        } else if ((num2 > num1) && (num2 > num3)) {
            System.out.println("Number2 is the greatest");
        } else {
            System.out.println("Number3 is the greatest");
        }
    }
}
