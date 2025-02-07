package practiceLC;

import java.util.ArrayList;
import java.util.List;

public class PermutationsArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(toNum(arr));
    }
//    public static List<List<Integer>> permute(int[] nums) {
//
//    }

    static int toNum(int[] arr){
        int res=0;
        for(int i=0;i<arr.length;i++) {
            res=res*10+arr[i];
        }
        return res;
    }
}
