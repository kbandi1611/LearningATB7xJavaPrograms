package August.ex17082024;

public class Lab209 {
    public static void main(String[] args) {
        int c = 0;
        try{
            c = 10/0;
        } catch(Exception e){
            System.out.println("Cant divide by zero");
        }
        System.out.println(c);
        System.out.println("End");
    }
}
