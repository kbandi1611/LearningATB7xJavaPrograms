package July.ex27072024;

public class Lab147 {
    public static void main(String[] args) {
        int[] salary = {7, 10, 20, 30, 40, 50, 60};
        int max = salary[0];
        int min = salary[0];

        for(int i = 0; i < salary.length; i ++) {
            if(salary[i] > max) {
                max = salary[i];
            }
            if(min > salary[i]){
                min = salary[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

        System.out.println(salary[salary.length-1]);
    }
}
