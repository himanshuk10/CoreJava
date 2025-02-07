package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Fail-fast iterators immediately throw a ConcurrentModificationException if the collection is
 * modified structurally (add, remove, etc.) while iterating over it.
 */

public class FailSafevsFailFast {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();//fail-fast
        List<String> names = new CopyOnWriteArrayList<>();
        names.add("aman");
        names.add("mohan");
        names.add("ramesh");

        Iterator iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            if (!names.contains("rohan")){
                names.add("rohan");
            }
        }
        System.out.println("..........."+names);
    }
}
