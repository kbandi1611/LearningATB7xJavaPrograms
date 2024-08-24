package August.ex18082024;

public class Lab216 {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        extracted1();
    }

    private static void extracted1() {
        try {
            Integer [] i = new Integer[2];
            System.out.println(i[3]); //ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            System.out.println("ArrayIndexOutOfBoundException");
        } finally {
            System.out.println("End of the program");
        }
    }

}
