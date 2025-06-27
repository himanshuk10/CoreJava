package comb.DSA.DynamicProgrammings;
/*
input: 2
output: 2
explaination: 1+1,2

input: 3
output: 3
explaination: 1+1+1,2+1,3

input: 5
output: 7
explaination: 1+1+1+1+1,2+1+1+1,2+2+1,3+1+1,3+2,4+1,5
 */
public class PrintingNumberSequenceCoinSum {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i +"->"+ i*i );

        }
    }
}
