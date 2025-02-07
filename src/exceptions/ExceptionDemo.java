package exceptions;

import java.util.Arrays;

public class ExceptionDemo {
    public static void main(String[] args) {
//        System.out.println(Square(10));
//        mergeArrays();
        pattern();
    }

    static int Square(int n) {
        try {
            System.out.println("In try.............");
            return n * n;
        } catch (Exception e) {
            System.out.println("In catch.............");
            return n * n;
        } finally {
            System.out.println("In finally.............");
            return n * n;
        }
//        return n*n;
    }

    public static void pattern(){
        int row = 6;
        for (int i = 0; i < row; i++) {
            for (int j =2*(row-i); j > 0 ; j--) {
                System.out.print(" ");
            }
            int k = 1;
            for (int j = 0; j < i; j++) {
                System.out.print((j+k)+" ");
            }
            System.out.println();
        }
    }
    public static void mergeArrays() {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8,9};
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] arr3 = new int[n1+n2];
        int i = 0, j = 0, k = 0;

        // Traverse arr1 and insert its elements into arr3
        while (i < n1) {
            arr3[k++] = arr1[i++];
        }

        // Traverse arr2 and insert its elements into arr3
        while (j < n2) {
            arr3[k++] = arr2[j++];
        }

        // Sort the entire arr3
        Arrays.sort(arr3);
        for (int n: arr3) {
            System.out.print(n+" ");
        }
    }

}
