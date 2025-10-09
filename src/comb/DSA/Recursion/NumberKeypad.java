package comb.DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class NumberKeypad {
    public static void main(String[] args) {
//        pod("","56");
        System.out.println(podList("","56"));
    }
    static void pod(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';

        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a'+ i);
            pod(p+ch, up.substring(1));
        }
    }
    static List<String> podList(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        List<String> list = new ArrayList<>();
        for (int i = (digit-1)*3; i < digit*3; i++) {
            char ch = (char) ('a'+ i);
            list.addAll(podList(p+ch, up.substring(1)));
        }
        return list;
    }

}
