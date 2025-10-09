package comb.DSA.practiceLC;

import java.util.Arrays;

public class ArraySumZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
    }
    static int[] sumZero(int n){
        int[] arr = new int[n];
        int index = 0;
        for (int i=1; i<= n/2; i++){
            arr[index++] = i;
        }
        if (n%2 != 0){
            arr[index++] = 0;
        }
        for (int i=1; i<= n/2; i++){
            arr[index++] = -i;
        }
        return arr;
    }
}
