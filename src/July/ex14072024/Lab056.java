package July.ex14072024;

public class Lab056 {
    public static void main(String[] args) {
        // Type Casting - Source and Destination conversion
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type), loss

        //Widening
        byte b = 10;
        int a = b; //valid - implicit casting - JVM
        int a1 = (int)b; // valid - explicit casting
        System.out.println(a1);

    }
}
