package August.ex24082024;

public class Lab238 {
    public static void main(String[] args) {
        Person p1 = new Person("Karthik", "Karnataka");
        Person p2 = new Person("Kumar", "Andhra");
        System.out.println(p1);
        System.out.println(p2);

    }

}
class Person extends Object{
    String name;
    String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ID -> " + name + ", Address -> " + address;
    }
}
