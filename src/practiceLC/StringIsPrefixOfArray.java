package practiceLC;

public class StringIsPrefixOfArray {
    public static void main(String[] args) {
        String s = "iloveleetcode";
        String[] words = {"i","love","leetcode","apples"};
        System.out.println(isPrefixString(s,words));
    }
    /*
    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder str = new StringBuilder(s);
        StringBuilder temp = new StringBuilder();
        for(int i=0; i<words.length; i++){
            temp = temp.append(words[i]);
            if(temp.toString().equals(str.toString())){
                return true;
            }
            if(temp.length() > s.length()){
                break;
            }
        }
        return false;
    }

     */
    public static boolean isPrefixString(String s, String[] words) {
        String temp = "";
        for(int i=0; i<words.length; i++){
            temp = temp + words[i];
            if(temp.equals(s)){
                return true;
            }
            if(temp.length() > s.length()){
                break;
            }
        }
        return false;
    }
}
