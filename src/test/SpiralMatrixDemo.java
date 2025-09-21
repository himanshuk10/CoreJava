package test;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixDemo {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(spiralMatrixTraversal(arr));
        userNameGenerator(5);
    }
    static List<Integer> spiralMatrixTraversal(int[][] arr){
        List<Integer> res = new ArrayList<>();
        if (arr == null || arr.length == 0 || arr[0].length == 0) return res;
        int left = 0;
        int top = 0;
        int right = arr[0].length-1;
        int bottom = arr.length-1;
        System.out.println(bottom);
        while (top <= bottom && left <= right){
            //left to right top is constant, left is var
            for (int i = left; i <= right; i++) {
                res.add(arr[top][i]);
            }
            top++;

            //top to bottom right is constant, top var
            for (int i = top; i <= bottom; i++) {
                res.add(arr[i][right]);
            }
            right--;

            //right to left, bottom is const, right is var
            if(top <= bottom){
                for (int i = right; i >= left ; i--) {
                    res.add(arr[bottom][i]);
                }
                bottom--;
            }

            //bottom to top, left is const, bottom var
            if (left <= right){
                for (int i = bottom; i >= top; i--) {
                    res.add(arr[i][left]);
                }
                left++;
            }
        }
        return res;
    }
    static void userNameGenerator(int n){
        String formate = "%05d";
        for (int i = 1; i <= n; i++) {
            String str = "user"+String.format(formate, i);
            System.out.println(str);
        }
    }
}
