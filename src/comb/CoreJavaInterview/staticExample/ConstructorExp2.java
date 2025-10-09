package comb.CoreJavaInterview.staticExample;
class Task{
    public int sum(int a, int b){
        return a+b;
    }
}
class ChildTask extends Task{
    public int sum(int a, int b, int c){
        return a+b+c;
    }
}
public class ConstructorExp2 {
    public static void main(String[] args) {
        ChildTask task = new ChildTask();
        System.out.println(task instanceof Task);
        System.out.println(task.sum(5,3));
    }
}
