package July.ex27072024;

public class Lab138 {
    public static void main(String[] args) {
        int [] marks = {90, 91, 92, 93, 94, 95};
        System.out.println(marks.length);
        System.out.println(marks[3]);
        System.out.println(marks[0]);
        System.out.println(marks[-1]); //ArrayIndexOutOfBoundsException
        System.out.println(marks[10]); //ArrayIndexOutOfBoundsException
    }
}
