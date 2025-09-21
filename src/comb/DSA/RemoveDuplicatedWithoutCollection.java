package comb.DSA;

import com.sun.source.doctree.SeeTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatedWithoutCollection {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,3,4,5};
//        System.out.println(Arrays.toString(unique(arr)));
        System.out.println(Arrays.toString(removeDuplicate(arr)));
    }
    static int[] unique(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        int count = 0;
        /*Set<Integer> set = new HashSet<>();
        for (int num : arr){
            set.add(num);
        }
        for (int num : set){
            temp[count++] = num;
        }*/

        for (int i = 0; i < n; i++) {
            //to check duplicate
            boolean isPresent = false;
            for (int j = 0; j < temp.length; j++){
                if (arr[i] == temp[j]){
                    isPresent = true;
                    break;
                }
            }

            //to store value in temp array
            if(!isPresent){
                temp[count++] = arr[i];
            }
        }
        return Arrays.copyOf(temp, count);
    }
    static int[] removeDuplicate(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int[] temp = new int[n];
        int k = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i+1]){
                temp[k++] = arr[i];
            }
        }
        temp[k++] = arr[n-1];
        int[] res = Arrays.copyOf(temp, k);
        return res;
    }
}
