package August.ex18082024.CollectionFramework;

import java.sql.Array;
import java.util.ArrayList;

public class Lab226 {
    public static void main(String[] args) {
        //Collection Framework
        //Collection - Interface
        //Collection(I) -> List(I)
        //List(I) -> ArrayList, LimkedList, Vector, Stack

        //Shopping list, Marks list, Collection of Items, Todo List, Student List
        //Collection myList3 = new ArrayList(); //Dynamic Dispatch
        //List mylist = new ArrayList(); //Dynamic Dispatch

        ArrayList myList = new ArrayList();
        myList.add("Karthik");
        myList.add("Kumar");
        myList.add("Reddy");
        myList.add(123);
        myList.add(true);

        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.contains("Karthik"));
        System.out.println(myList.contains("Sowji"));
        String s1 = (String) myList.get(1);
        System.out.println(s1);
    }

}
