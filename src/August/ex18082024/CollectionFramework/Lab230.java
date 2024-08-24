package August.ex18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab230 {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(93);
        marks.add(90);
        marks.add(65);
        marks.add(85);
        marks.add(90);
        System.out.println(marks);
        Collections.sort(marks, Comparator.reverseOrder());
        System.out.println(marks);
    }
}
