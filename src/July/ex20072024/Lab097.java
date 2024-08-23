package July.ex20072024;

public class Lab097 {
    public static void main(String[] args) {
        int itemcode = 006;
        switch(itemcode) {
            case 001, 002, 003:
                System.out.println("It is an electronic gadget");
                break;
            case 004, 005, 007:
                System.out.println("It is an electrical gadget");
                break;
            default:
                System.out.println("None");

        }
    }
}
