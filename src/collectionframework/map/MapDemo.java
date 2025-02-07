package collectionframework.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put(101,"Aman");
        map.put(102,"ashish");
        map.put(103,"mongo");
        map.put(104,"ranul");
        map.put(105,null);
        map.put(106,null);

//        map.put(null, null);
//        map.put(null,1234);
//        map.put("aaa",123);

//        System.out.println(map.get(103));

//        System.out.println(map.containsKey(102));

//        System.out.println(map.containsValue("rahul"));

//        System.out.println(map.size());

//        System.out.println(map.entrySet());//retun all the entry as set

//        map.replace(105,"www");

//        map.remove(106);
        System.out.println(map);
    }
}
