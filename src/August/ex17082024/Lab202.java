package August.ex17082024;

public class Lab202 {
    public static void main(String[] args) {
        Car c = new Car("Lambo");
        c.drive();
        //System.out.println(c.make);

        //to access the inner class object creation
        Car.Gearbox cg = c.new Gearbox();
        cg.m2();


    }
}

class Car{
    private String make;

    public Car(String make) {
        this.make = make;
    }

    void drive(){
        System.out.println("You can drive the car");
    }

    class Gearbox{
        void m2(){
            System.out.println("M2");
        }
        class NutBolts{

        }
    }
}
