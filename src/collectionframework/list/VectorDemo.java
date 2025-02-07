package collectionframework.list;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("rahul");
        v.add(1,"aman");
        v.add("ravi");
        v.add(100);
        v.add(123.2);
        v.add('c');
        v.add("rahul");
        v.add(1,"aman");
        v.add("ravi");
        v.add(100);
        v.add(123.2);
        v.add('c');
        System.out.println(v.capacity());

//        v.removeElementAt(2);
//        System.out.println(v);
    }
}
