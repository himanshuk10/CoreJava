package comb.DSA.twoPointersSlidingWindows;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {1,0,0,2,0,9};
        moveZeroStarting(nums);
        moveZeroStartingM2(nums);
    }
    static void moveZeroStarting(int[] nums){
        //{1,0,0,2,0,9}
        int j = -1;
        for(int i = nums.length-1; i>=0; i--){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        if( j == -1){
            return;
        }
        for (int i = j-1; i >= 0; i--) {
            if(nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j--;
            }
        }
        for(int num : nums){
            System.out.print(num+" ");
        }
    }
    static void moveZeroStartingM2(int[] nums){
        int left = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                left = i;
                break;
            }
        }
        if(left == -1){
            return;
        }
        for (int right = left + 1; right < nums.length-1; right++) {
            if(nums[right] == 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
        for (int num : nums){
            System.out.print(num +" ");
        }
    }
}
