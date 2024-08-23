package July.ex14072024;

public class Lab058 {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.5F;
        //int total_price = course + GST; // implicit narrowing - JVM
        int total_price = course + (int)GST; // explicit narrowing - Real time - money loss
        System.out.println(total_price);

    }
}
