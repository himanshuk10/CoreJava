package comb.CoreJavaInterview.TrickyQuestionCoreJava;

public class CloningDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Alpha obj = new Alpha();
        obj.i = 5;
        obj.j = 6;
        // shallow copy - >
        // Alpha obj1 = obj;

//        //deep copy
//        Alpha obj1 = new Alpha();
//        obj1.i = obj.i;
//        obj1.j = obj.j;
//        obj1.j = 18;
//        System.out.println(obj);
//        System.out.println(obj1);

        Alpha obj1 = (Alpha) obj.clone();
        obj1.j = 10;
        System.out.println(obj1);
        System.out.println(obj);
    }
}
class Alpha implements Cloneable{
    int i;
    int j;

    @Override
    public String toString() {
        return "Alpha{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
