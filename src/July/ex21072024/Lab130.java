package July.ex21072024;

import java.util.Scanner;

public class Lab130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its factorial: ");
        int n = sc.nextInt();

        int fact = 1;
        for(int i = 1; i <= n; i ++) {
            fact = fact * i;
        }
        System.out.println(fact);

        sc.close();
    }
    //Factorial Program


}
