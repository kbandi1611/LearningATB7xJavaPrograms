package July.ex20072024;

import com.sun.security.jgss.GSSUtil;

public class Lab098 {
    public static void main(String[] args) {
        //JDK > 13
        int itemcode = 005;
        switch(itemcode) {
            case 001 -> System.out.println("It is a laptop");
            case 002 -> System.out.println("It is a desktop");
            case 003, 004 -> System.out.println("It is a mobile phone");
            default -> System.out.println("Hello!");
        }
    }
}
