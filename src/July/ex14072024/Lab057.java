package July.ex14072024;

public class Lab057 {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
        //short s = phone_no; // implicit narrowing- JVM?
        short s = (short)phone_no;
        System.out.println(s);
        //JVM - GC -
    }
}
