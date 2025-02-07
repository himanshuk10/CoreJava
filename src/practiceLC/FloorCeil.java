package practiceLC;

import java.util.Arrays;

public class FloorCeil {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,9};
        int target = 8;
        System.out.println(Arrays.toString(FloorAndCeil(arr,target)));
    }
    private static int[] FloorAndCeil(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int floor = -1, ceil = -1;
        while (start <= end){
            int mid = start+(end-start)/2;
            if(target > arr[mid]){
                floor = arr[mid];
                start = mid + 1;
            }else if(target < arr[mid]){
                ceil = arr[mid];
                end = mid - 1;
            }
        }
        return new int[]{floor, ceil};
    }
}
