package August.ex18082024.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab232 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList();
        myList.add("Karthik");
        myList.add("Kumar");
        myList.add("Reddy");

        System.out.println("-- To print ArrayList - 1");

        for(String str: myList){
            System.out.println(str);
        }
        System.out.println("-- To print ArrayList - 2");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println("-- To print ArrayList - 3");

        //Iterator
        Iterator<String> iterator = myList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
