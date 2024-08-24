package August.ex04082024;

public class Lab169 {
    public static void main(String[] args) {
        ATBPerson p0 = new ATBPerson();
        ATBPerson p1 = new ATBPerson("Karthik");
        ATBPerson p2 = new ATBPerson("Kumar");
        ATBPerson p3 = new ATBPerson("Praveen", 987643210);

        System.out.println(p0.name);
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p3.name);
        System.out.println(p3.phone);
    }
}
