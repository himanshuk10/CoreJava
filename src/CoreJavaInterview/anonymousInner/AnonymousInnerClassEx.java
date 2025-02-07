package CoreJavaInterview.anonymousInner;

class ABC{
    public void show(){
        System.out.println("in ABC show");
    }
}
//class BCD extends ABC{
//    public void show(){
//        System.out.println("in BCD show");
//    }
//}

public class AnonymousInnerClassEx {
    public static void main(String[] args) {
        ABC obj = new ABC(){
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();

    }
}
