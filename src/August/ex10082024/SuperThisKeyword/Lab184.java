package August.ex10082024.SuperThisKeyword;

public class Lab184 {
}

class Student extends Person{

    void message(){
        System.out.println("I am a Student message");
    }
    void display(){
        super.message();
    }
}

class Person{
    void message(){
        System.out.println("I am a person message");
    }
}