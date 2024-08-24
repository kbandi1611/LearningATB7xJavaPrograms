package August.ex11082024.ex_interface;

public class Lab190 {
    // Interface - Hide the implementation
    // Interface variables will be inherited to subclasses.
    // interface is a keyword which is used to define User Defined Datatypes.

    public static void main(String[] args) {
        //Engine e = new Engine(); //not possible to create an object for interface class
        WagonR wagonR = new WagonR();
        wagonR.drive();
    }
}
