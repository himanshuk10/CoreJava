package comb.CoreJavaInterview.anonymousInnerAbstract;

 abstract class ABC{
    public abstract void show();
    public abstract void config();
}


public class AnonymousInnerClassEx {
    public static void main(String[] args) {
        ABC obj = new ABC(){
            public void show(){
                System.out.println("in new show");
            }

            @Override
            public void config() {
                System.out.println("in config");
            }
        };
        obj.show();
    }
}
