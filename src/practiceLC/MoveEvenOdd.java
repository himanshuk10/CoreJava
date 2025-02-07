package practiceLC;

public class MoveEvenOdd {
    public static void main(String[] args) {
        int[] arr = {2,5,1,4,7,8,9};
        System.out.println(moveEvenOdd(arr));
//        int[] result = moveEvenOdd(arr);
//        for (int i : result){
//            System.out.println(i);
//        }
    }

    private static int moveEvenOdd(int[] arr) {
        int move = 0;
        int left = 0;
        int right = arr.length-1;
        while (left < right){
            if(arr[left] % 2 == 0){
                left++;
            } else if (arr[right] % 2 !=0) {
                right--;
            }else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                move++;
            }
        }
        return move;
    }
}
