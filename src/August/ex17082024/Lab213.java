package August.ex17082024;

public class Lab213 {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a = 0;
        try{
            int x = 10/a;
        } catch(Exception e){
            System.out.println("Division by 0 error");
        }finally{
            System.out.println("I will execute anyhow!!");
        }
    }
}
