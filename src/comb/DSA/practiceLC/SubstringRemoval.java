package comb.DSA.practiceLC;

import java.util.Stack;

public class SubstringRemoval {
    public static void main(String[] args) {
        String str = "ACBBDABDCA";
        System.out.println(minLength(str));

    }
    public static int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(c);
                continue;
            }

            if(c == 'B' && stack.peek()=='A'){
                stack.pop();
            }
            else if(c == 'D' && stack.peek()=='C'){
                stack.pop();
            }else
                stack.push(c);
        }
        return stack.size();
    }
}
