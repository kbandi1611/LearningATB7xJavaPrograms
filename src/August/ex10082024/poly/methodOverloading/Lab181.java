package August.ex10082024.poly.methodOverloading;

public class Lab181 {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        int result = mathOperations.add(2, 3);
        double result2 = mathOperations.add(4.2, 5.4);
        String result3 = mathOperations.add("Karthik", "Kumar");
        String result4 = mathOperations.add("Karthik", 123);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
