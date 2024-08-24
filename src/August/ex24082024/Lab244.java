package August.ex24082024;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab244 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
        ht1.put(4, "four");

        Enumeration<Integer> e = ht1.keys();
        while(e.hasMoreElements()){
            System.out.println(ht1.get(e.nextElement()));
        }
    }
}
