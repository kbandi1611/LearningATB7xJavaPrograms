package August.ex11082024.exCar;

public class WagonR extends Engine{
    void drive(){
        openCar();
        start();
        partGearBox();
        speed();
        stop();
    }

    @Override
    void start() {
        System.out.println("Starting WagomR");

    }

    @Override
    void openCar() {
        System.out.println("Open the Keys");

    }

    @Override
    void partGearBox() {
        System.out.println("Part of a Gearbox");

    }

    @Override
    void stop() {
        System.out.println("Stop Wagon R");

    }

    void speed(){
        System.out.println("100KM/Hr");
    }

}
