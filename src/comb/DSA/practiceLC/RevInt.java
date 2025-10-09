package comb.DSA.practiceLC;

public class RevInt {
    public static void main(String[] args) {
        revnum(123);
    }

    //1. reverse without changing to string
    static void revnum(int num){
        int ans = 0;
        while(num != 0){
            int rem = num%10;
            ans = ans*10 + rem;
            num /= 10;
        }
        System.out.println(ans);
    }

    //2. subtract without - opetrator
    static void subtract(int a, int b){

    }
}
