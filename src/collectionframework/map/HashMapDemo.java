package collectionframework.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap();
        hm.put(101,"Aman");
        hm.put(102,"ashish");
        hm.put(103,"mongo");
        hm.put(104,"ranul");
        hm.put(105,null);


//        System.out.println(hm.get(103));
//
//        System.out.println(hm.containsKey(102));
//
//        System.out.println(hm.containsValue("rahul"));
//
//        System.out.println(hm.size());

        System.out.println(hm);
        for (Map.Entry me : hm.entrySet()) {
            System.out.println(me.getKey()+" -> "+me.getValue());
        }
//        Set set = hm.entrySet();
//        Iterator itr = set.iterator();
//        while (itr.hasNext()){
////            System.out.println(itr.next());
//            Map.Entry entry = (Map.Entry) itr.next();
//            System.out.println(entry.getKey()+" -> "+entry.getValue());
//        }

    }
}
