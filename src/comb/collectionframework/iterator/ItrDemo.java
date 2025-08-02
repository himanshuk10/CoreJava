package comb.collectionframework.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ItrDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add("john");
        list.add("adam");
//        System.out.println(list);

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }

        list.remove("adam");
        System.out.println(list);
    }
}
