package August.ex10082024.SuperThisKeyword;

public class Lab185 {

}
class Person1{
    Person1(){
        System.out.println("Person1 - DC");
    }
    Person1(String a){
        System.out.println("Person1 - PC A1");
    }
    Person1(String a, int a1){
        System.out.println("Person1 - PC A2");
    }
}
class Student1 extends Person1{
    int a = 10;
    Student1(String S){
        System.out.println("PC - Student");
    }
    Student1(){
        super();
//        super("Pramod");
//        super("Pramod", 15);
//        this("pramod");
        System.out.println(this.a);

    }


}