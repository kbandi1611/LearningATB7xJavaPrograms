package July.ex27072024;

import java.util.Scanner;

public class Lab139 {
    public static void main(String[] args) {
        int marks[] = new int[3];
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = 90;
        marks[2] = 92;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        boolean [] is_married = {true, false, true, false};
        for(int i = 0; i < marks.length; i++) {
            System.out.println(i + "->" + marks[i]);
        }

        String weekdays[] = {"Monday", "Tuesday", "Wednesday", "Thursday"};
        for(int i = 0; i < weekdays.length; i ++) {
            System.out.println(i + "." + weekdays[i]);
        }

    }
}
