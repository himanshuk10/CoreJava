package comb.DSA.practiceLC;
//https://leetcode.com/problems/sum-of-digits-of-string-after-convert/description/?envType=problem-list-v2&envId=string
public class SumOfDigitsOfStringAfterConvert {
    public static void main(String[] args) {
        String s = "iiii"; 
        int k = 1;
        System.out.println(getLucky(s, k));
//        System.out.println(getValue('z'));
//        System.out.println(digitSum(24));
    }
    public static int getLucky(String s, int k) {
        StringBuilder strB = new StringBuilder();
        for (char ch : s.toCharArray()) {
            strB.append(getValue(ch));
        }

        String result = strB.toString();
        while (k-- > 0) {
            int sum = 0;
            for (char c : result.toCharArray()) {
                sum += c - '0';
            }
            result = String.valueOf(sum);
        }

        return Integer.parseInt(result);
    }
    static int getValue(char c){
        return c - 'a' + 1;
    }
//    static int digitSum(int num){
//        int sum = 0;
//        while(num > 0){
//            sum += num%10;
//            num /= 10;
//        }
//        return sum;
//    }
}
