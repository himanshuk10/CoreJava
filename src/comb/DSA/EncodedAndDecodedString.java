package comb.DSA;

import java.util.ArrayList;
import java.util.List;

public class EncodedAndDecodedString {
    public static void main(String[] args) {
        EncodedAndDecodedString encodedAndDecodedString = new EncodedAndDecodedString();
        List<String> list = List.of("tech", "prep", "is", "op");
        System.out.println(encodedAndDecodedString.encode(list));
    }
    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        StringBuilder res = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        for (String str : strs) {
            sizes.add(str.length());
        }
        for (int size : sizes) {
            res.append(size).append(',');
        }
        res.append('#');
        for (String str : strs) {
            res.append(str);
        }
        return res.toString();
    }
}
