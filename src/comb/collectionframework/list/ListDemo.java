package comb.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(10); // [10]
        list.add(1,20);// [10,20]
        list.add(2,25);// [10,20,25]
        list.add(3,35);// [10,20,25,30]
        list.add(null); // [10,20,25,30,null]
        list.add(1, null); //[10,null,20,25,30,null]
//        System.out.println(list);

        //hashnext(), next() and method of Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        //iterate through list iterator
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

    }
}
