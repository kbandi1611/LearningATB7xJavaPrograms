package August.ex11082024.StaticKeyword;

public class Lab193 {
    //Static
    //Data Member
    //Keyword
    //Class
    //Function
    public static void main(String[] args) {
        ATB a1 = new ATB("Amit");
        System.out.println(a1.getName());
        System.out.println(ATB.courseName);

        ATB a2 = new ATB("Pramod");
        System.out.println(a2.getName());

    }

}
class ATB{
    private String name;
    static String courseName = "ATB";


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ATB(String name) {
        this.name = name;
    }
}
