package comb.CoreJavaInterview.TrickyQuestionCoreJava;

public class WhenfinallyNotExecuted {
    public static int test(){
        try {
            System.exit(1);
        } finally {
            System.out.println("In finally");
            return 1;
        }
    }
    public static void main(String[] args) {
        test();
    }
}
