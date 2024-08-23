package July.ex20072024;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
        //Take the user input as char and tell the user if it is a vowel or not
        //aeiou

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char, I will tell whether it is a vowel or not");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);

        switch(user_input) {
            case 'a':
                System.out.println("It is a Vowel");
                break;
            case 'e':
                System.out.println("It is a Vowel");
            case 'i':
                System.out.println("It is a Vowel");
                break;
            case 'o':
                System.out.println("It is a Vowel");
                break;
            case 'u':
                System.out.println("It is a Vowel");
            default:
                System.out.println("It is a consonant");


        }
    }
}
