package August.ex18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab229 {
    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("Karthik");
        myList.add("Kumar");
        myList.add("Reddy");
        myList.add("Karthik");
        myList.add("Karthik");

        // add, remove, clear, contains, indexOf, isEmpty, size, get
        // addAll, removeAll, retainAll, containsAll

        System.out.println(myList);
        System.out.println(myList.size());
        myList.remove("Karthik");
        System.out.println(myList);
        myList.clear();
        System.out.println(myList);
        System.out.println(myList.isEmpty());

        myList.add("Karthik");
        myList.add("Kumar");
        myList.add("Reddy");
        myList.add("Karthik");
        myList.add("Karthik");
        System.out.println(myList);
        myList.add("Kiran");
        System.out.println(myList);
        myList.set(1, "Anusha");
        System.out.println(myList);

        myList.add(123);
        myList.add(true);
        System.out.println(myList);

        //How to print
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        //Using for each loop

        for (Object o: myList){
            System.out.println(o);
        }


    }
}
