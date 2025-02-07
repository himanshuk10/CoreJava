package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByLength {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("anayanan");
        list.add("mohit");
        list.add("abbbbbbbns");
        list.add("cxhahw");

        System.out.println(list);
//        Collections.sort(list);

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()){
                    return 1;
                }else
                    return -1;
            }
        };
        Collections.sort(list,comparator);
        System.out.println("sorted list: "+list);
    }
}
