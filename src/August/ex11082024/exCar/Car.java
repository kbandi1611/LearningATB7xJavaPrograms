package August.ex11082024.exCar;

class Car extends Engine {
    //Engine
    //Gearbox
    //Keys

    //Tesla is a Car
    //Tesla - Drive()


    @Override
    void stop() {
        System.out.println("Stop a Car");

    }

    @Override
    void start() {
        System.out.println("Start a Car");

    }

    @Override
    void partGearBox() {
        System.out.println("Part of GearBox");

    }

    @Override
    void openCar() {
        System.out.println("Open a Car with Keys");

    }

    void speed(){
        System.out.println("Speed of a Car");
    }
}
