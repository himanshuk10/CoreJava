package collectionframework.iterator;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add(10);
        v.add("john");
        v.add("aman");
//        System.out.println(v);
        Enumeration e = v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
