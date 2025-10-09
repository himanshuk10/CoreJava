package comb.DSA;

public class FindSumOfDigitSingle {
    public static void main(String[] args) {
        System.out.println(sumDigit(9999));
    }
    static int sumDigit(int n){
        int sum = 0;
        while (n > 0){
            sum += n%10;
            n /= 10;
        }
        if (sum<10){
            return sum;
        }
        return sumDigit(sum);
    }
}
