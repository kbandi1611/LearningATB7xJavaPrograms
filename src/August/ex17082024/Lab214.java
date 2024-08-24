package August.ex17082024;

public class Lab214 {
    public static void main(String[] args) {
        try{
            int a = 10/0;
        } catch(Exception e){
            System.out.println("Zero Division error");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I will be executed anyhow!!");
        }
    }
}
