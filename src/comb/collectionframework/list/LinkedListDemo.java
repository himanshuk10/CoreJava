package comb.collectionframework.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        al.add(10);
        al.add(90);
        al.add("robin");

//        LinkedList ll = new LinkedList(al);
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(30);
        ll.add("rahul");
        ll.add("rahul");
        ll.add(14);
        ll.add('c');
        System.out.println(ll);

//        System.out.println(ll.getFirst());
//        System.out.println(ll.getLast());
//        ll.removeFirst();
//        System.out.println(ll);
//        ll.removeLast();
//        System.out.println(ll);

    }
}
