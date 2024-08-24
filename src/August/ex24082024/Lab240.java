package August.ex24082024;

import java.util.*;

public class Lab240 {
    public static void main(String[] args) {
        //List - allow duplicates
        //Set - doesn't allow duplicates
        Set hs = new HashSet();//Hashing mechanism to store the elements, no order
        hs.add("Apple");
        hs.add("Orange");
        hs.add("Watermelon");
        hs.add("Grapes");
        hs.add("grapes");
        hs.add(null);
        System.out.println("------------------Using Hashset---------------------------");
        System.out.println(hs);
        System.out.println(hs.isEmpty());

        Set lhs = new LinkedHashSet(); //Linkedlist mechanism to store the elements, order will maintain
        lhs.add("Pinepple");
        lhs.add("Banana");
        lhs.add(null);
        lhs.add("Cranberry");
        lhs.add("Apple");
        System.out.println("------------------Using Linked Hashset---------------------------");
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());


        Set ts = new TreeSet(); //Red Black tree mechanism to store the elements, order will maintain
        ts.add("Dates");
        ts.add("Apple");
        ts.add("Mangoes");
        ts.add("Apple");
        ts.add("Banana");
        ts.add("Grapes");
        //ts.add(null);
        System.out.println("------------------Using Treeset---------------------------");
        System.out.println(ts);

        System.out.println("---------------Using for each loop of treeset-------------");
        for(Object s: ts){
            System.out.println(s);
        }

        Iterator it = ts.iterator();
        System.out.println("------------------Using iterator of treeset------------");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
