package August.ex10082024.SuperThisKeyword;

public class Lab183 {
    //super()
    //1. Use of super with variables
    //2. Use of super with methods
    //3. Use of super with constructors

    // super keyword in Java is a reference variable that allows
    // a sub class - child class
    // to refer to its parent class
    public static void main(String[] args) {
        Car s = new Car();
        s.display();
    }
}
class Car extends Vehicle{
    private int maxSpeed = 200;
    Car(){
        super(10); //Constructor Chaining
        System.out.println("DC Car");
    }
    public void display(){
        System.out.println("Car speed is -> " + this.maxSpeed);
        System.out.println("Vehicle speed is -> " + super.maxSpeed);
        super.message();
        this.message();
    }
    @Override
    void message(){
        System.out.println("Hello Vehicle");
    }
}
class Vehicle{
    public int maxSpeed = 180;
    Vehicle(){
        System.out.println("DC Vehicle");
    }
    Vehicle(int a){
        System.out.println("PC Vechicle");
    }

    void message(){
        System.out.println("Hello Vehicle");
    }
    void message(int a){
        System.out.println("Hello Vehicle");
    }
}
