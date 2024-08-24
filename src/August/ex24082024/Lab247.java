package August.ex24082024;

public class Lab247 {
    public static void main(String[] args) {
        temp("Pramod");
        temp(123);
        temp(true);

        sum(3,4);
        sum("Pramod", "Dutta");
        //T - reference to the datatype that you want to use

    }

    public static <T> T sum(T a, T b) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }

    public static <Dutta> void temp(Dutta name){
        System.out.println(name);
    }

}
