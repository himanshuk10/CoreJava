package test;


import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static <T> T Car (T model){
        return model;
    }
    public static void main(String[] args){
//        int[] arr = {100, 200, 300, 400, 100, 200, 300, 400, 100, 200, 300, 400, 100, 200, 300, 400};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Car("model"));
//        generateUsernames(20);
//        countFreq("Hello world I am your friend hello hii");
        int[] nums = {1,0,-6,-1,7,3};

//        System.out.println(Arrays.toString(moveZerosToFront(num)));
//        reverseArray(num);
//        String str = "eye";
//        boolean b = checkStringPalindrome(str);
//        System.out.println(b);
//        System.out.println(maxumumSubarraySum(nums));
        System.out.println(sumOfDigitRecursion(1235));
        System.out.println(factorial(5));
        System.out.println(fibo(7));
    }

    private static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    private static int sumOfDigitRecursion(int n) {
        if(n == 0){
            return 0;
        }
        return sumOfDigitRecursion(n/10) + n%10;
    }
    private static int factorial(int n){
        if(n == 0) return 1;
        return n*factorial(n-1);
    }

    private static int maxumumSubarraySum(int[] nums) {
        int currSum =  0;
        int maxi = nums[0];
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            maxi = Math.max(currSum, maxi);
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxi;
    }

    private static boolean checkStringPalindrome(String str) {
        int left = 0;
        int right = str.length()-1;
        while (left < right){
            if(str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    private static void reverseArray(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left < right){
            //swap -
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static int[] moveZerosToFront(int[] arr) {
        //zero to end
        int n = arr.length;
       /* int j = 0;
        for (int i=n-1; i>=0; i--){
            if(arr[i]==0){
                j = i;
                break;
            }
        }
        for (int i = j-1; i >= 0; i--) {
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        */
        int index = n-1;
        for (int i = n-1; i >=0 ; i--) {
            if(arr[i] != 0)
                arr[index--] = arr[i];
        }
        while (index >= 0){
            arr[index--] = 0;
        }
        return arr;
    }
    public static void generateUsernames(int n) {
        String format = "%05d"; // Fixed 5-digit format like 00001

        for (int i = 1; i <= n; i++) {
            String username = "user" + String.format(format, i);
            System.out.println(username);
        }
    }
    public static void countFreq(String str){
        String[] split = str.toLowerCase().split(" ");
        Map<String, Long> charCount = Arrays.stream(split).filter(c-> !c.equals(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charCount);


//        Map<Character, Long> wordCount = str.chars().filter(c -> c != ' ')
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//        System.out.println(wordCount);
    }
    static char firstNonRepeating(String str){
        Map<Character, Integer> freq = new TreeMap<>();
        for (char ch : str.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }

        for (Map.Entry<Character, Integer> entry : freq.entrySet()){
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return ' ';
    }

}