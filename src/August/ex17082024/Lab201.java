package August.ex17082024;

public class Lab201 {

}
//Nested class - rarely we will be using it

class OC{
    Integer a = 10;

    void OC_m1(){
        System.out.println("OC_M1");
    }
    static class P{
    }
    class InnerClass{
        Integer b = 20;
        void Inner_m2(){
            System.out.println(a);
            System.out.println("IC_M2");
        }
    }
}
