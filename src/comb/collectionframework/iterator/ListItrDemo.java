package comb.collectionframework.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListItrDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10);
        list.add("john");
        list.add("adam");

        ListIterator listIterator = list.listIterator();

        System.out.println("Forward direction-------->");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
//
//        listIterator.next(); //moving cursor forward
//        listIterator.next();
//        listIterator.next();


        System.out.println("Backward direction <------------");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

//        listIterator.add(200);
//        System.out.println(list);//adding the value

        listIterator.set(200); //replacing the cursor last cursor value
        System.out.println(list);
    }
}
