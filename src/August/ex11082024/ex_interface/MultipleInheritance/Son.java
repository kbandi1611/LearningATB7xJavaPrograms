package August.ex11082024.ex_interface.MultipleInheritance;

public class Son implements Mother, Father{

    @Override
    public void home() {
        System.out.println();
    }

    @Override
    public void money() {
        System.out.println("This is only one function");
    }
}
