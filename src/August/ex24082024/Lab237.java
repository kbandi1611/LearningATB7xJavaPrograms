package August.ex24082024;

import java.util.ArrayList;
import java.util.Collections;

public class Lab237 {
    public static void main(String[] args) {
        ArrayList marks = new ArrayList();
        marks.add(14);
        marks.add(16);
        marks.add(18);
        marks.add(19);

        Collections.sort(marks); //Natural Sorting
        System.out.println(marks);

        ArrayList names = new ArrayList();
        names.add("Karthik");
        names.add("Reddy");
        names.add("Veera");
        names.add("Kumar");
        Collections.sort(names);
        System.out.println(names);
    }

}
