package August.ex10082024.poly.methodOverriding;

public class Lab182 {
    //Method Overriding / Runtime polymorphism
    public static void main(String[] args) {
        Hound H1 = new Hound();
        H1.bark();
        H1.bike();

        Dog d1 = new Dog();
        d1.bark();

        Dog dog_ref = new Hound();
        dog_ref.bark();
        //dog_ref.bike();

        //Hound h1 = new Dog();
    }
}
