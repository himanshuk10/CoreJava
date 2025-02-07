package collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();

        set.add(100);
        set.add(200);
        set.add(300);
        set.add(50);
        set.add(400);
        set.add(null);
        System.out.println(set);

        // Iterate through iterator
        Iterator itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
