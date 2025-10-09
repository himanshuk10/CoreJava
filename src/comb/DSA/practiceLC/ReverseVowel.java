package comb.DSA.practiceLC;

public class ReverseVowel {
    public static void main(String[] args) {
        System.out.println(reverseVowelInString("Himanshu"));
    }
    public static String reverseVowelInString(String str){
        char[] words = str.toCharArray();
        int left = 0;
        int right = words.length-1;
        String vowel = "aeiouAEIOU";// System.out.println(vowel.indexOf('q'));

        while(left<right){
            //check for left most vowel in the words
            while (left<right && vowel.indexOf(words[left])==-1){
                left++;
            }
            //check for right most vowel in words
            while (left<right && vowel.indexOf(words[right])==-1){
                right--;
            }
            //swap left vowel with right vowel
            char temp = words[left];
            words[left] = words[right];
            words[right]=temp;

            left++;
            right--;
        }
        String answer = new String(words);
        return answer;
    }
}
