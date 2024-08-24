package August.ex11082024.ex_interface.ex2;

public interface Engine {
    void startEngine();
    void stopEngine();

    default void haltingEngineJustStart(){
        System.out.println("Halt the engine");
    }
    default void haltingEngineJustStop(){
        System.out.println("Halt the engine");
    }

    static void M1() {
        System.out.println("M1");
    }
//    void M2(){    //Complete methods are not possible in interface
//        System.out.println("M2");
//    }
    void m2();

    void m3();


}
