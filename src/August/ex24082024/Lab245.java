package August.ex24082024;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Lab245 {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht1 = new Hashtable<>();
        ht1.put(1, "one");
        //ht1.put(null, "one"); // java.lang.NullPointerException
        ht1.put(2, "one");
        System.out.println(ht1);

        HashMap h1 = new HashMap();
        h1.put(null,"dasda");
        System.out.println(h1);

        Set<String> fruits = new HashSet();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("apple");
        fruits.add("Water Melon");
        //fruits.add(123);
        System.out.println(fruits);
    }
}
