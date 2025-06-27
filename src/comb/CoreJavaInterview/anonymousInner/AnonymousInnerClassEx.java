package comb.CoreJavaInterview.anonymousInner;

class ABC{
    public void show(){
        System.out.println("in ABC show");
    }
    public void add(int a, int b){
        System.out.println("sum: "+ (a+b));
    }
}
//class BCD extends ABC{
//    public void show(){
//        System.out.println("in BCD show");
//    }
//
interface xyz{
    void display();
}


@FunctionalInterface
interface lamdaTesting{
    int sum(int a, int b);
    default int sub(int a, int b){
        return a-b;
    }
}

public class AnonymousInnerClassEx {
    public static void main(String[] args) {
        ABC obj = new ABC(){
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();
        ABC obj2 = new ABC(){
            @Override
            public void show() {
                System.out.println("in 2nd new show");
            }
        };
        obj2.show();

        ABC obj3 = new ABC(){
            @Override
            public void add(int a, int b) {
                System.out.println("yaha hm add nahi sub karenge just for testing: "+(a-b));;
            }
        };
        obj3.add(5,6);

        xyz obj4 = new xyz() {
            @Override
            public void display() {
                System.out.println("Displaying interface implementation");
            }
        };
        obj4.display();

//        lamdaTesting lamdaTesting = new lamdaTesting() {
//            @Override
//            public int sum(int a, int b) {
//                return a+b;
//            }
//        };

        lamdaTesting lamdaTesting = (a,b) -> a+b;
        int result = lamdaTesting.sum(2,4);
        System.out.println(result);
    }
}
