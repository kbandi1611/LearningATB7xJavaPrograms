package August.ex17082024;

public class Lab199 {
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();

        a.age = 12;
        System.out.println(A.discount);
        a.m2();
        A.m1();
        //Static dont need object reference - True
    }
}


class A{
    int age = 10; //Instance Variable
    static int discount = 199; //static variable

    //SIB - Static Initialization Block
    static {
        System.out.println("One Time Load SIB");
    }
    //IIB - Instance Initialization Block
    {
        System.out.println("IIB when object is created");
    }

    static void m1(){
        System.out.println("m1");
    }

    void m2(){
        System.out.println("m2");
        System.out.println("discount");
    }

}