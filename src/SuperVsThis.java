
class ABC{
    public ABC(){
        System.out.println("In ABC");
    }
    public ABC(int n){
        System.out.println("In ABC INT");
    }
}
class CDE extends ABC{
    public CDE() {
        super(6);
        System.out.println("IN CDE");
    }
    public CDE(int n){
        this();
        System.out.println("IN CDE INT");
    }
}

public class SuperVsThis {
    public static void main(String[] args) {
        CDE obj = new CDE(6);
    }
}
