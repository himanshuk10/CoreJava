package comb.CoreJavaInterview.TrickyQuestionCoreJava;

public class ReturnInTryFinally {
    public static int test(){
        try{
            System.out.println("In try");
            return 1;
        }finally {
            System.out.println("In finally");
            return 2;
        }
    }
    public static void main(String[] args) {
        System.out.println("Returned value: "+test());
    }
}
