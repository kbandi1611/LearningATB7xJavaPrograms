package August.ex04082024;

import java.util.Scanner;

public class Lab170 {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name of the bank: ");
        String bName = sc.next();

        System.out.println("Enter your balance: ");
        int bal = sc.nextInt();
        System.out.println("Enter your bank code: ");
        String bCode = sc.next();

        BankAccount ICICI =new BankAccount(bName, bal, bCode);
        ICICI.printDetails();
        sc.close();

    }
}
