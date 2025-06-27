package comb.collectionframework.set;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();

        ts.add(20);
        ts.add(10);
        ts.add(100);
        ts.add(40);
        ts.add(0);

        System.out.println(ts.contains(20));
        ts.clear();
        System.out.println(ts);

    }
}
