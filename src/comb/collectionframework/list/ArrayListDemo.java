package comb.collectionframework.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add("rahul");
        al.add(40);
        System.out.println(al);
        Iterator itr = al.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
//        al.add("asdf");
//        al.add(10.30);
//        al.add(new int[]{1, 2, 3});
//        al.add(10);


//        ArrayList al2 = new ArrayList();
//        al2.add(101);
//        al2.add(202);
//        al2.add(302);
//        al2.add("asdf");
//        al2.add(10.30);
//
//        al.addAll(al2);
//
//        System.out.println(al);
//        al.remove("asdf");


//        ArrayList al2 = new ArrayList<>();
//        al2.add(20);
//        al2.add(30);
//        al.removeAll(al2);
//        System.out.println(al);

//        al.clear();

//        al.set(3,"deepak");//replace
//        System.out.println(al.contains(20));
//        System.out.println(al);
//        System.out.println(al.indexOf("deepak"));

        //Immutable List
        List<Integer> number = Arrays.asList(1,2,3,4); // add not allowed but set allowed
        number.add(6); //throw exception
        number.set(3,5);
        System.out.println(number);

        List<Integer> number1 = List.of(9,10,11,12,13);// add or set both are not allowed
        number1.add(4);//
        number1.set(2,100);
        System.out.println(number1);
        /*
        so we can create 100% Immutable list using List.of()
         */


    }
}
