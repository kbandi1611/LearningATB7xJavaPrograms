package August.ex17082024;

public class Lab210 {
    public static void main(String[] args) {
        System.out.println("Start of the program");
        int b = 0;
        try{
            String ip = args[0]; //ArrayIndexOutOfBoundException
            int a = Integer.parseInt(ip); //Number format Exception
            b = 1000/a;
        }catch(ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println(b);
        System.out.println("End of the program");
    }
}
