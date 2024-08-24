package August.ex11082024.exCar;

public class Tesla extends Engine {
    @Override
    void start() {
        System.out.println("Starting Tesla");

    }

    @Override
    void stop() {
        System.out.println("Stopping Tesla");

    }

    @Override
    void speed() {
        System.out.println("300km/hr");

    }

    @Override
    void partGearBox() {
        System.out.println("Electric");

    }

    @Override
    void openCar() {
        System.out.println("Open the Tesla");

    }

}
