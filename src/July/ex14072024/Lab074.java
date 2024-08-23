package July.ex14072024;

public class Lab074 {
    public static void main(String[] args) {
        String name1 = "The Testing Academy"; //SCP
        String name2 = "The Testing Academy"; //SCP
        String name3 = new String("The Testing Academy"); //Heap Area

        System.out.println(name1 == name2); // check for the Ref
        System.out.println(name1.equals(name2)); //check for the content

        System.out.println(name2 == name3); // check for the Ref
        System.out.println(name2.equals(name3)); //check for the content
    }
}
