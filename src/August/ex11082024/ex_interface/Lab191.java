package August.ex11082024.ex_interface;

public class Lab191 {
    public static void main(String[] args) {

    }
}
interface I{}
class A{} //concrete class
class B{} //concrete class
abstract class C{} //abstract class
class Test1 extends A{} //single inheritance
class Test2 extends B{} //single inheritance
//class Test3 extends A, B{} //multiple inheritance not possible
class Test0 implements I{}
interface I1{}
interface I2{}
class Test4 implements I1,I2{} //multiple inheritance is possible using interfaces
class Test5 extends A implements I1, I2{}
//class Test6 implements I1 extends A{} //not possible
//interface I3 extends A{} //not possible
//interface I4 implements A{} //not possible
//interface I5 extends A,B{} //not possible
interface I6 extends I1,I2{}
//interface I7 extends C{}





