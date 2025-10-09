package comb.collectionframework.set;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetDemo {
    public static void main(String[] args) {

        LinkedList ls = new LinkedList();
        ls.add("ramesh");
        ls.add(89);
        ls.add('v');

        HashSet hs = new HashSet();
        hs.addAll(ls);
        hs.add(10);
        hs.add("rahul");
        hs.add(102.3);
        hs.add('c');
        hs.add(10);
        hs.add(30);
        hs.add(20);
        hs.add(400);

        System.out.println(hs.contains("ramesh"));
        System.out.println(hs.size());

//        Iterator itr = hs.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
    }
}
