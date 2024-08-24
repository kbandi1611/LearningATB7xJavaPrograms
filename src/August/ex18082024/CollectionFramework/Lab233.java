package August.ex18082024.CollectionFramework;

import javax.management.ValueExp;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab233 {
    public static void main(String[] args) {
        List myList = new ArrayList(5); //Father Reference and Child Object
        myList.add("Karthik");
        myList.add("Kumar");
        myList.add("Reddy");
        myList.add("Karthik");
        myList.add("Karthik");
        myList.add("Karthik");

        System.out.println(myList);

        Vector v = new Vector();
        v.add("Karthik"); //t1
        v.add("Kumar"); //t1
        v.add("Reddy"); //t1
        System.out.println(v);
        //Only problem with the vector is thread safe and synchronized
        //It will be time-consuming
        //One by one
        //Slower




    }
}
