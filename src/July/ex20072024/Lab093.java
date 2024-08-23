package July.ex20072024;

import java.util.Locale;
import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {
        // Web Automation
        // I will ask user which browser you want me to run the code.
        // chrome -> start chrome, firefox -> firefox, edge -> execution edge

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name!!!, where you want to execute the program!!");
        String browser_name = sc.next();
        browser_name = browser_name.toLowerCase();

        switch (browser_name) {
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                break;
            case "edge":
                System.out.println("Starting the edge browser");
                break;
            default:
                System.out.println("I have no idea which browser is this!!!");
                break;

        }

    }
}
