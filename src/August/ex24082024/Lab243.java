package August.ex24082024;

import java.util.HashMap;
import java.util.Map;

public class Lab243 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("id1", 1);
        map.put("id2", 2);
        map.put("id3", 35);
        map.put("id4", null);
        map.put("id5", null);
        map.put(null, 101);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(35));
        System.out.println(map.containsValue(05));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("id4"));
        System.out.println("===================================");

        //How to iterate over all the elements in the map
        for(Map.Entry<String, Integer> item: map.entrySet()){
            System.out.println(item.getKey() + "---->" + item.getValue() );
        }

    }
}
