package comb.DSA.practiceLC.pattern;

public class Pattern {
    public static void main(String[] args) {

        System.out.println("testing..");
        test();

//        System.out.println("pattern 1 --------");
//        pattern1();
//        System.out.println("2. ----------------------");
//        pattern2();
//        System.out.println("3.  -----------------------");
//        pattern3();
//        System.out.println("4.  ------------------------");
//        pattern4();
//        System.out.println("5.  -------------------------");
//        pattern5();
//        System.out.println("6.  --------------------------");
//        pattern6();
//        System.out.println("pyramid.......");
//        pyramid();
//        System.out.println("rev pyramid.............");
//        revpyramid();
//        System.out.println("combination............");
//        combinationPy();

    }

    static void pattern1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            int k = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(k++);
            }
            System.out.println();
        }
    }

    static void pattern5(){
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    static void pattern6(){
        for (int i = 1; i <= 4; i++) {
            //for space
            for (int j = 3; j >= i; j--) {
                System.out.print(" ");
            }
            //for star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            //space
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            //star
            for (int j=3; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pyramid(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            int k = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void revpyramid(){
        for (int i = 2; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void combinationPy(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            int k = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void test(){
        for (int i = 1; i <= 5; i++) {
            for (int j=4; j>=i;j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
